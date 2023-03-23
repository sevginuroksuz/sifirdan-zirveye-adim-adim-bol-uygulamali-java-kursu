package operatorler;

public class AritmetikAtama {
    public static void main(String[] args) {

        /* Aşağıdaki ifadenin vereceği çıktıyı hesaplayınız.

                double ondalikliSayi=6.50;
                double sonuc = 0;
                sonuc++;
                ondalikliSayi *= sonuc;
                System.out.println("Sonuç : " + sonuc);


        double ondalikliSayi = 6.50;
        double sonuc = 0;
        sonuc++;           // sonuc = sonuc + 1 = 1

        sonuc *= ondalikliSayi;    // sonuc = sonuc * ondalikliSayi = 1 * 6.50 = 6.50
        S
        System.out.println("Sonuc: " + sonuc);

         */

        // ODEV

        int s1 = 10;
        int s2 = 6;

        s1++;
        --s2;

        s1 *= --s2;

        System.out.println("s1 in son degeri: " + s1);
        System.out.println("s2 in son degeri: " + s2);






    }
}
