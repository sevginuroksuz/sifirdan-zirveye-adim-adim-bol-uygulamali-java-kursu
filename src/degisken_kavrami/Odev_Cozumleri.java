package degisken_kavrami;

public class Odev_Cozumleri {
    public static void main(String[] args) {

        /*1 Aşağıdaki ifadeleri hesaplayıp ekrana bastırın ve sonuçları yorumlayın.

                  String stringSayi = "150";

          integer bir değişken oluşturup içine yukarıdaki metin olarak verilen ifadeyi atayıp ekrana yazdırınız.
          Sonrasında bu değeri tekrar metine çevirip ekrana yazdırınız.
          
        */

           String stringSayi="150";
           int degisken = Integer.parseInt(stringSayi);
           System.out.println("Degisken 1 : " + degisken);

           degisken = Integer.valueOf(stringSayi);
           System.out.println("Degisken 2 : " + degisken);


            stringSayi = String.valueOf(degisken);
             System.out.println("String Sayinin son degeri : " + stringSayi);

         
        /*2 Aşağıdaki ifadeleri hesaplayıp ekrana bastırın ve sonuçları yorumlayın.

                     int sayi 1 = 5 / 3 ;
                     float sayi2 = 5f / 3f ;
                     double sayi3 = 5d / 3d;
         */

              int sayi1 = 5/3;      // int ondalık kısmı almaz sadece tam kısmı saklıyor.
              System.out.println(sayi1);
              float sayi2 = 5f/3f;      // float virgülden sonra 7 karakter saklıyor.
              System.out.println(sayi2);
              double sayi3 = 5d/3d;    // double virgülden sonra 16 karakter saklıyor. 16. karakteri yuvarlayarak hesaplıyor.
              System.out.println(sayi3);

         

        /*3 Aşağıdaki ifadelerin sonucu nedir ve sonucu yorumlayın.

                System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
                System.out.println(1.0 - 0.9);
        */

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);  // 0.5 degerini görmeliyiz.
        System.out.println(1.0 - 0.9);    // 0.1 degerini görmeliyiz.

         

        /*4 Aşağıdaki ifadelerin sonuçlarını ekrana yazdırın ve sonucu yorumlayın.

           int s1 = 1;                                    int s1 = 1;
           int s2 = 2;                                    int s2 = 2;
           double ortalama = (s1 + s2) / 2;               double ortalama = (s1 + s2) / 2.0;
           System.out.println(ortalama);                  System.out.println(ortalama);

        * */

         int s1 = 1;
         int s2 = 2;
         double ortalama = (s1 + s2) / 2;   // sonuc 1.5 olmali fakat double ifade oldugu belirtilmedigi icin int olarak kabul edildi ve sonuc 1 cikti.
        System.out.println("Ortalama: "+ ortalama);

        ortalama = (double) (s1 + s2) / 2;   // dogrusu
        System.out.println("Ortalama: "+ ortalama);

        ortalama = (s1 + s2) / 2.0;    // sonuc 1.5
        System.out.println("Ortalama: "+ ortalama);




    }
}
