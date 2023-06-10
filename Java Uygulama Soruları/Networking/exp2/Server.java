package Java2;

import java.io.*;
import java.net.*;
// Bu program, clientın server‘a gönderdiği sayının server tarafından karesi alınıp tekrar client’a iletmesinden oluşmaktadır.  
// Client’ı  socket programlarda hizmet isteyen istemci olarak adlandırabiliriz. 
// İstediği zaman server’a bağlanıp istekte bulunur ve serverdan dönen cevabı alır. 
// Yine istediği zaman bağlantıyı koparabilir.
// Server da bu durumda socket programlarda hizmet veren sunucu oluyor. 
// Client istediği zaman sunucuya bağlanabileceği için serverın sürekli açık olup, Clientın bağlanacağı portu dinliyor olması gerekmektedir.

public class Server {
 
     public static void main(String[] args) throws IOException {
          String clientGelen;
          ServerSocket serverSocket = null;
          Socket clientSocket = null;
 
          int sayi;
 
          try {
        	  // Server 7755 portunu client’ ın bağlanması için dinliyor. 
        	  // Port açarken dikkat etmemiz gereken önemli bir konuda portun 1 ile 1024 arasında  olmamasıdır. 
        	  // Çünkü bu değer aralıklarındaki portlar spesifik portlardır ve root tarafından kullanılır. 
        	  // Eğer 1-1024 arasında bir portu kullanmaya çalışırsak programımız “bind permission” hatası verecektir.
               serverSocket = new ServerSocket(7755);
          } catch (Exception e) {
               System.out.println("Port Hatası!");
          }
          System.out.println("SERVER BAŞLANTI İÇİN HAZIR...");
          //* Bağlantı sağlamadan program bir alt satırdaki kod parçasına geçmez (accept) *//
          clientSocket = serverSocket.accept();
 
          //* Client'a veri gönderimi için kullandığımız PrintWriter nesnesi oluşturulur *//
          PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
 
          //* Client'dan gelen verileri tutan BufferedReader nesnesi oluşturulur *//
          BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
 
          while((clientGelen = in.readLine()) != null) { 
        	   // clientGelen=in.readLine(); komutu istemciden gelen datayı okur ve clientGelen değişkenine aktarır. 
               System.out.println("Client'dan gelen veri = " + clientGelen);
               
               sayi = Integer.valueOf(clientGelen);
               // String veri tipini integer veri tipine donusturur.
               
               out.println(sayi*sayi); 
               // Bu komut ile istemciden gelen sayının karesini alıp tekrar istemciye iletiyoruz.
          }
          out.close();
          in.close();
          clientSocket.close();
          serverSocket.close();
     }
}