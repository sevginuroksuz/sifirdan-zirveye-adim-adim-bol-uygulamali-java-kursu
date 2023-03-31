package soru_cozum;

import java.util.Scanner;

public class SayilariTopla {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Sayilari Topla Uygulamasina Hos Geldiniz");
        System.out.println("-----------------------------------------");
        System.out.println("Toplama islemini kactan kaca kadar yapmak istiyorsunuz? ");
        System.out.println("Baslangic: ");
        int baslangic = in.nextInt();
        System.out.println("Bitis: ");
        int sayi = in.nextInt();
        int toplam=0;
        for(int i=baslangic; i<sayi; i++ )
        {
            toplam += i;
        }

        System.out.println("Toplam: " + toplam);
    }
}
