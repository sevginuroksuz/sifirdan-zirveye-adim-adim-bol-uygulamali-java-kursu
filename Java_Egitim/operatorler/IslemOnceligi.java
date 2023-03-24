package operatorler;

public class IslemOnceligi {
    public static void main(String[] args) {
        /* Aşağıdaki sonuc degiskenine atanacak değerleri sırasıyla hesaplayınız.

               int sayi1=15;
               int sayi2 = 5;
               int sonuc = 0;
               sonuc = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1
               sonuc = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1
        * */
        /* İşlem önceliği sırası büyükten küçüğe doğru şu şekildedir:

            () önce parantez içi hesaplanır
            ++ ve -- (eğer değişkenden önce ise)
            çarpma ve bölme
            toplama ve çıkarma
            = atama işlemi
            ++ ve -- (eğer değişkenden sonra ise)

        * */

                int sayi1 = 15;
                int sayi2 = 5;
                int sonuc = 0;
                sonuc = ( sayi1 + sayi2 * 2 - sayi2 ) + sayi2 - sayi1 * 4 + sayi1;  // 0nce parantez içleri yapilir. -> sonuc = (15 + 5*2 - 5) + sayi2 - sayi1 * 4 + sayi1 = 20 + + sayi2 - sayi1 * 4 + sayi1
                                                                                    // Sonra parantez kaldırılır ve islem onceligi takip edilerek hesaplanır.  sonuc = 20 + 5 - 15 * 4 + 15 = 20 + 5 - 60 + 15 = -35 + 15 = -20

                System.out.println("( sayi1 + sayi2 * 2 - sayi2 ) + sayi2 - sayi1 * 4 + sayi1 = " + sonuc);

                sonuc = ( sayi1 * sayi2 + 4 / 2 ) + sayi1++ * sayi2 + sayi1;    // 0nce parantez içleri yapilir. -> sonuc = ( 15 * 5 + 4 / 2 ) + sayi1++ * sayi2 + sayi1 = 77 + sayi1++ * sayi2 + sayi1
                                                                                   // Sonra parantez kaldırılır ve islem onceligi takip edilerek hesaplanir. sonuc = 77 + 15*5 + 15 = 168

                System.out.println("( sayi1 * sayi2 + 4 / 2 ) + sayi1++ * sayi2 + sayi1 = " + sonuc);



    }
}
