package soru_cozum;

import java.util.Scanner;

public class CarpimTablosu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] tablodakiSayi = new int[50];
        int kacSayi,kactan, kacaKadar;
        System.out.println("Kac tane sayinin carpim tablosunu istiyorsunuz? ");
        kacSayi = in.nextInt();
        System.out.println("Carpim tablosunu istediginiz sayilari giriniz: ");
        for(int i=0; i<kacSayi; i++)
        {
            tablodakiSayi [i] = in.nextInt();

        }
        System.out.println("Sayilarin kactan kaca kadar caprim tablosunu istiyorsunuz? ");
        System.out.println("Baslangic: ");
        kactan = in.nextInt();
        System.out.println("Bitis: ");
        kacaKadar = in.nextInt();


        for (int j=0; tablodakiSayi[j] != '\0'; j++ )
        {
            System.out.println("-----" + tablodakiSayi[j] +" Icin Carpim Tablosu ----- ");
            for(int i=kactan; i<=kacaKadar; i++ ) {

                System.out.println("             " + tablodakiSayi[j] + " x " + i + " = " + (i * tablodakiSayi[j]));
            }
            System.out.println("      ");

        }


    }
}
