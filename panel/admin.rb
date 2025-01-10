require 'socket'
require 'google/protobuf'
require_relative 'C:/Users/berka/Downloads/sistem proje/panel/Subscriber_pb'

def main
  servers = [
    { name: "Server1", host: "localhost", port: 5001 },
    { name: "Server2", host: "localhost", port: 5002 },
    { name: "Server3", host: "localhost", port: 5003 }
  ]

  puts "Lütfen bağlanmak istediğiniz sunucuyu seçin:"
  puts "1 - Server1"
  puts "2 - Server2" 
  puts "3 - Server3"
  
  secim = gets.chomp.to_i
  
  if secim < 1 || secim > 3
    puts "Geçersiz seçim! Program sonlandırılıyor."
    return
  end

  secilen_server = servers[secim - 1]
  
  subscriber = Subscriber.new(
    id: 1,
    name_surname: "Odev Deneme",
    status: Subscriber::Status::SUBS
  )

  begin
    puts "#{secilen_server[:name]}'e #{secilen_server[:port]} portundan bağlanılıyor..."
    socket = TCPSocket.new(secilen_server[:host], secilen_server[:port])

    case secilen_server[:name]
    when "Server1"
      # Server1'e abone bilgisi gönder
      data = Subscriber.encode(subscriber)
      socket.write(data)
      puts "Abone bilgisi #{secilen_server[:name]}'e gönderildi."
      
      # Server1'den yanıt al
      response = socket.gets
      puts "#{secilen_server[:name]}'den yanıt: #{response}"

    when "Server2"  
      # Server2'ye yük dengeleme isteği gönder
      request = "LOAD_BALANCE_REQUEST"
      socket.puts(request)
      
      # Yük durumunu al
      load_status = socket.gets
      puts "#{secilen_server[:name]}'den yük durumu: #{load_status}"

    when "Server3"
      # Server3'ten kapasite bilgisi iste
      capacity_request = "REQUEST_CAPACITY" 
      socket.puts(capacity_request)
      
      # Kapasite bilgisini al
      capacity = socket.gets
      puts "#{secilen_server[:name]}'den kapasite bilgisi: #{capacity}"
    end

    socket.close
  rescue StandardError => e
    puts "#{secilen_server[:name]}'e bağlanırken hata: #{e.message}"
  end
end

main if __FILE__ == $PROGRAM_NAME