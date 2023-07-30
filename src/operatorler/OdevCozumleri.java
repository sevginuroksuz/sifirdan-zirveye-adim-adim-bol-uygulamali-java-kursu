package operatorler;

public class OdevCozumleri {

    public static void main(String[] args) {

        /* Ödev 1
           Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun.
           Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
           Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.


           int saniye = 1500;
           int kacDakika = 1500 / 60;
           int kalanSaniye = 1500 % 60;
           System.out.println(saniye + " saniye " + kacDakika + " dakika " + kalanSaniye + " saniyedir.");

         */

        /* Ödev 2
           Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı saklayın.
           Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
           100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
           Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)


           double fahrenheit = 100.0d;
           double celcius = 5/9.0 * ( fahrenheit - 32 );

           System.out.println(fahrenheit + " fahrenheit " + celcius + " Celciustur.");

         */

        /* Ödev 3
           Bir yıl değerinin artık yıl olup olmadığını hesaplayın
           Bir yılın artık olması için ya 400 ile modu 0 olmalı yada 4 ile modu 0 olmalı ve 100 ile modu 0 olmamalı
           4100 false değer vermeli.
        * */

          int yil = 2023;

          // Birinci Cozum

          if ((yil % 400) == 0) {

              System.out.println(yil + " artik yildir.");

          }
          else if (((yil % 4) == 0) && ((yil % 100) != 0) ) {

              System.out.println(yil + " artik yildir.");

          }

          else {
              System.out.println(yil + " yildir.");
          }

          // Ikinci Cozum


         boolean artikYilMi = ((yil % 400) == 0) || (((yil % 4) == 0) && ((yil % 100) != 0)) ;

          if (artikYilMi)
        {
            System.out.println(yil + "artik yildir.");
        }
          else
        {
            System.out.println(yil + " yildir.");
        }



    }
}
