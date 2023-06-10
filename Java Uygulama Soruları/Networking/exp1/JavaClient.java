package Java1;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class JavaClient {

    public static void main(String[] args) {
   
        Socket serverSocket;
        DataOutputStream dataOutputStream;
     // İstemci oluşturmak için Socket sınıfı kullanılır.

        try {
            serverSocket = new Socket("localhost", 1453);
         // Socket sınıfı parametre olarak sunucu ve port bilgilerini alir. 
         // Sunucumuz olmadigi icin localhost yazariz.
         // Bu örnek aynı bilgisayardaki 1453 port numaralı sunucuya erişerek Merhaba ağ programlama yazısını göndermektedir.
           
            dataOutputStream = new DataOutputStream(serverSocket.getOutputStream());
            dataOutputStream.writeUTF("Merhaba ağ programlama");
            serverSocket.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

}