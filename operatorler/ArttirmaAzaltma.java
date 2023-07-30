package operatorler;
public class ArttirmaAzaltma {
    public static void main(String[] args) {
        /* Aşağıdaki ifadenin sonucunu hesaplayınız.

                  int sayi1 = 10;
                  int sayi2 = ++sayi1;
                  int sayi3 = sayi1--;
                  System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++));
        **/

        int sayi1 = 10;

        int sayi2 = ++sayi1;   // sayi2=11 olmalı, sayi1=11 olmalı

        int sayi3 = sayi1-- ;    // sayi3=11 olmalı, sayi1=10 olmalı

        System.out.println("Sonuc: " + (( sayi1 ) + ( --sayi2 ) + ( sayi3++ )) ); // sayi1=10, sayi2=11, sayi3=11 di. Sonuc= 10+10+11=31 olmalı


    }
}
