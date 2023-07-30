package soru_cozum;

import java.util.Scanner;

public class SayilariEkranaYazdir {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Sayilari kactan kaca kadar yazdirmak istiyorsun: ");
        System.out.println("Baslangic: ");
        int baslangic = in.nextInt();
        System.out.println("Bitis: ");
        int bitis = in.nextInt();
        int i;
        for (i= baslangic; i< bitis; i++)
        {
            System.out.print(i+", ");
        }
            System.out.print(i);
    }
}
