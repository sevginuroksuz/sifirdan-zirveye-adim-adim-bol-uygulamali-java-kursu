package operatorler;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        /* sayi1 ve sayi2 diye iki integer değişken oluşturun ve bunlara sırasıyla 20 ve 40 değerlerini atayın.
          Bu değişkenleri + * / - ve % operatörleri ile işleme sokup sonuçlarını ekrana yazdırın.
         * */

        int sayi1 = 20;
        int sayi2 = 40;

        System.out.println("Sayi 1: " + sayi1 + " Sayi 2: " + sayi2 + " Toplamlari: " + ( sayi1 + sayi2 ) );
        System.out.println("Sayi 1: " + sayi1 + " Sayi 2: " + sayi2 + " Farkleri: " + (sayi1 - sayi2 ) );
        System.out.println("Sayi 1: " + sayi1 + " Sayi 2: " + sayi2 + " Carpimlari: " + (sayi1 * sayi2 ) );
        System.out.println("Sayi1 : " + sayi1 + " Sayi 2: " + sayi2 + " Bolumleri: " + ((double) sayi1 / sayi2 ) );
        System.out.println("Sayi 1: " + sayi1 + " Sayi2: " + sayi2 + " Modu (kalan): " + ( sayi1 % sayi2 ) );



    }
}
