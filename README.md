# Dist_-Subs
Proje Amacı
Bu proje, Protobuf teknolojisini kullanarak dağıtık bir abonelik yönetim sistemi geliştirmeyi hedeflemektedir. Sistem, sunucular, istemciler, bir yönetim paneli (admin) ve veri görselleştirme aracı (plotter) gibi bileşenlerden oluşmaktadır. Her bir bileşen, TCP soketleri aracılığıyla iletişim kurar ve veri alışverişi, Protobuf formatında tanımlanmış mesajlar üzerinden gerçekleştirilir.

Program Çıktıları:
 Server 1 için: 
![image](https://github.com/user-attachments/assets/7e47becc-34c9-4e78-9340-e89b869334fc)


Server 2 için:

![image](https://github.com/user-attachments/assets/2fabce07-5177-46c1-91fd-8d26c8fc0ba3)



Servr 3 için:

![image](https://github.com/user-attachments/assets/cf2986d2-2865-44ab-834f-b6ad0ad03942)


PROJE BEKLENTİLERİ

Sunucular (Server1, Server2, Server3): Sunucular, gelen talepler doğrultusunda abonelik işlemlerini gerçekleştirir ve kapasite durumu gibi bilgileri sağlar. CAPACITY_REQUEST mesajı alındığında, mevcut abone bilgilerini döndürür. Bu işlemler, Protobuf kullanılarak tanımlanmış Capacity ve Subscriber nesneleri ile yapılır.

İstemci (Client): İstemciler, sunucularla iletişime geçerek yeni abonelikler oluşturur. Ayrıca sunucular arasında yük dengelemesi yaparak iş yükünü paylaşır.

Yönetim Paneli (Admin): Yönetim paneli, tüm sunucularla etkileşimde bulunarak kapasite sorgulama işlemleri gerçekleştirir. Ayrıca, mesaj gönderme ve test işlemleri yapma yeteneğine sahiptir.

Plotter (Veri Görselleştirici): Plotter, sunucuların kapasite bilgilerini toplar ve bu verileri grafiksel olarak, canlı bir şekilde görselleştirir.




EKİP ÜYELERİ
22060341 Reşit Berkay Kırboz
22060395 Hakan Erikçi
22060372 Berkay Anaklı
