import matplotlib.pyplot as plt
import socket
import time
from google.protobuf.message import DecodeError
from capacity_pb2 import Capacity
from subscriber_pb2 import Subscriber

class SimplePlotter:
    def __init__(self):
        self.server_data = {
            1: {'times': [], 'counts': [], 'name': 'Server1'},
            2: {'times': [], 'counts': [], 'name': 'Server2'}, 
            3: {'times': [], 'counts': [], 'name': 'Server3'}
        }
        
        self.fig, self.ax = plt.subplots()
        plt.ion()

    def update_plot(self):
        """Grafiği günceller."""
        self.ax.clear()
        for server_id, data in self.server_data.items():
            if data['times'] and data['counts']:
                self.ax.plot(data['times'], data['counts'], label=data['name'])

        self.ax.set_xlabel('Zaman')
        self.ax.set_ylabel('Abone Sayısı') 
        self.ax.set_title('Sunucu Abonelik Durumu')
        self.ax.grid(True)
        self.ax.legend()
        plt.draw()
        plt.pause(0.1)

    def collect_data(self):
        """Sunuculardan veri toplar ve grafiği günceller."""
        
        server_ports = {1: 5001, 2: 5002, 3: 5003}

        while True:
            for server_id, port in server_ports.items():
                try:
                    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
                        s.settimeout(2.0)
                        s.connect(('localhost', port))
                        s.sendall(b'CAPACITY_REQUEST')
                        data = s.recv(1024)

                        capacity = Capacity()
                        capacity.ParseFromString(data)

                        current_time = time.time()
                        self.server_data[server_id]['times'].append(current_time)
                        self.server_data[server_id]['counts'].append(capacity.server_status)

                        # Veri noktalarını sınırla
                        if len(self.server_data[server_id]['times']) > 50:
                            self.server_data[server_id]['times'].pop(0)
                            self.server_data[server_id]['counts'].pop(0)

                except (ConnectionError, DecodeError, socket.timeout) as e:
                    print(f"{self.server_data[server_id]['name']} bağlantı hatası: {e}")
                    # Bağlantı hatası durumunda 0 değeri ekle
                    if self.server_data[server_id]['times']:
                        self.server_data[server_id]['times'].append(time.time())
                        self.server_data[server_id]['counts'].append(0)

            self.update_plot()
            time.sleep(1)

if __name__ == "__main__":
    plotter = SimplePlotter()
    plotter.collect_data()