 import java.io.*;
import java.net.*;

public class Server3 {
    public static void main(String[] args) {
        final int SUNUCU_PORTU = 5003; // Sabit port numarası
        final int MAX_KAPASITE = 1000; // Maksimum sunucu kapasitesi
        int mevcutKapasite = 0; // Mevcut kullanılan kapasite

        try {
            // Sunucu soketini oluştur
            ServerSocket sunucuSoketi = new ServerSocket(SUNUCU_PORTU);
            System.out.println("Server3 " + SUNUCU_PORTU + " portunda çalışıyor");

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

                // Kapasite bilgisi isteğini kontrol et
                if (gelenMesaj.equals("REQUEST_CAPACITY")) {
                    // Rastgele bir kapasite değeri oluştur
                    mevcutKapasite = (int)(Math.random() * MAX_KAPASITE);
                    String kapasite = String.format("Mevcut kapasite: %d/%d", mevcutKapasite, MAX_KAPASITE);
                    yazici.println(kapasite);
                    System.out.println("Kapasite bilgisi gönderildi: " + kapasite);
                } else {
                    // Diğer istekler için varsayılan yanıt
                    yazici.println("Server3: Bilinmeyen istek");
                }

                // Bağlantıyı kapat
                istemciSoketi.close();
            }
        } catch (IOException e) {
            System.err.println("Sunucu hatası: " + e.getMessage());
        }
    }
}
