import java.net.*;
import java.io.*;
import com.example.protobuf.SubscriberOuterClass.Subscriber;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int[] SERVER_PORTS = {5001, 5002, 5003};
    private static final int TIMEOUT_MS = 5000; // Bağlantı zaman aşımı süresi
    
    public Subscriber subscribe(String nameSurname) throws IllegalArgumentException {
        if (nameSurname == null || nameSurname.trim().isEmpty()) {
            throw new IllegalArgumentException("İsim Soyisim bos olamaz");
        }
 
        for (int port : SERVER_PORTS) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(SERVER_HOST, port), TIMEOUT_MS);
                
                try (socket) {
                    Subscriber request = Subscriber.newBuilder()
                        .setStatus(Subscriber.Status.SUBS)
                        .setNameSurname(nameSurname.trim())
                        .build();
                    
                    request.writeDelimitedTo(socket.getOutputStream());
                    
                    Subscriber response = Subscriber.parseDelimitedFrom(socket.getInputStream());
                    if (response != null) {
                        return response;
                    }
                }
            } catch (IOException e) {
                System.err.println(port + " portundaki sunucuya bağlanılamadı: " + e.getMessage());
            }
        }
        throw new RuntimeException("Hiçbir sunucuya erişilemiyor!");
    }
    
    public static void main(String[] args) {
        Client client = new Client();
        try {
            String kullaniciAdi = "Hakan Erikci";
            System.out.println(kullaniciAdi + " için kayıt deneniyor...");
            
            Subscriber response = client.subscribe(kullaniciAdi);
            System.out.println("Başarıyla kaydolundu. ID: " + response.getId());
        } catch (Exception e) {
            System.err.println("Hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }
    }
}