import java.io.*;
import java.net.*;
import java.util.Random;

public class Server1 {
    public static void main(String[] args) {
        final int SUNUCU_PORTU = 5001; // Sabit port numarası

        try {
            // Sunucu soketini oluştur
            ServerSocket sunucuSoketi = new ServerSocket(SUNUCU_PORTU);
            System.out.println("Server1 " + SUNUCU_PORTU + " portunda çalışıyor");

            // Sürekli istemci bağlantılarını dinle
            while (true) {
                // İstemci bağlantısını kabul et
                Socket istemciSoketi = sunucuSoketi.accept();
                System.out.println("Yeni istemci bağlandı");

                // Giriş ve çıkış akışlarını hazırla
                InputStream giris = istemciSoketi.getInputStream();
                OutputStream cikis = istemciSoketi.getOutputStream();
                
                BufferedReader okuyucu = new BufferedReader(new InputStreamReader(giris));
                PrintWriter yazici = new PrintWriter(cikis, true);

                // İstemciden gelen mesajı oku
                String gelenMesaj = okuyucu.readLine();
                System.out.println("Alınan mesaj: " + gelenMesaj);

                // Yük dengeleme isteğini kontrol et
                if (gelenMesaj.equals("LOAD_BALANCE_REQUEST")) {
                    // Rastgele bir yük durumu oluştur (0-100 arası)
                    Random random = new Random();
                    int yukDurumu = random.nextInt(101);
                    
                    // Yük durumunu gönder
                    yazici.println("Sunucu yük durumu: %" + yukDurumu);
                    System.out.println("Yük durumu gönderildi: %" + yukDurumu);
                } else {
                    // Diğer istekler için varsayılan yanıt
                    yazici.println("Server1: Bilinmeyen istek");
                }

                // Bağlantıyı kapat
                istemciSoketi.close();
            }
        } catch (IOException e) {
            System.err.println("Sunucu hatası: " + e.getMessage());
        }
    }
}