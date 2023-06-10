package Java1;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServer {

// Socket (Soket): Bilgisayar işlemleri veya bilgisayarlar arası işlemler için kullanılan haberleşme dosyalarıdır.
// Soket programlama veya Ağ programlama gelen isteklerin yönetilmesini sağlayan programlama tekniğidir.	
// HTTP, FTP, SMTP gibi iletişim protokolleri soket yapısı üzerine inşa edilmiştir.
// Soket yapısı kullanılarak bilgisayarlar arası erişim sağlanarak veri haberleşmesi yapılır.
// Ayrıca kendi kurallarımızı belirleyerek chat-sohbet, dosya transferi gibi uygulamalar yapabiliriz.	
    
	public static void main(String[] args) {
		
		// Socket işlemleri için java.net paketinde yer alan çeşitli sınıflar kullanılır.
		// Sunucu ve istemcinin olduğu temel bir yapıda ServerSocket ve Socket sınıflarının kullanımı yeterli olacaktır.
		// Java ile bir sunucu oluşturmak için ServerSocket sınıfı kullanılır.
        ServerSocket serverSocket;
        Socket clientSocket;
        DataInputStream dataInputStream;
        String mesaj;
        try {
            serverSocket = new ServerSocket(1453);
         // Sunucu oluşturmak için sadece port numarasını vermek yeterli olacaktır.
            
            clientSocket = serverSocket.accept();
         // Sunucu oluşturulduktan sonra gelen istekleri kabul etmek için accept metodu kullanılır.
         // Metot dönüş değeri olarak Socket türünden bir nesne döndürür.
            
            
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
         // İstek kabul edildikten sonra Socket sınıfında yer alan getInputStream metodu ile istemciden gelen veriler okunmuştur.
         // İstemciye bir veri göndermek istenildiğinde getOutputStream metodu kullanılır.
         // Metotlar byte formatında işlem yaptığından DataInputStream ve DataOutputStream sınıfları ile Text tabanlı veri gönderimi yapılmıştır.
            
            mesaj = dataInputStream.readUTF();
         // readUTF ile UTF 8 olan karakterleri okuma islemini gerceklestiririz. 
    	 // readUTF'den string bir deger dondugu icin onu string bir nesne olan mesaja atayabiliriz. 
            
            System.out.println("Alınan mesaj: " + mesaj);
            serverSocket.close();
         // Socket sınıfında yer alan çeşitli metotlar kullanılarak sunucu ve istemci arasında iletişim sağlanır.
         // Son olarak socket sunucusu ile işlem bittiğinde close metodu ile sunucunun kapatılması faydalı olacaktır.
            
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

}