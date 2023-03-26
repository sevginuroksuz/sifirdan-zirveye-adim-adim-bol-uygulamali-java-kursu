package soru_cozum;

import java.util.Scanner;

public class SayiOrtalamasiBulma {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Kac tane sayinin ortalamasini alacaksiniz? ");
        int kacSayi = in.nextInt();

        double  toplam=0.0;

        for(int i=0; i<kacSayi; i++)
        {
            System.out.println("Lutfen bir sayi girin: ");
            double sayi = in.nextDouble();
            toplam += sayi;

        }
        double ortalama = toplam / kacSayi;
        System.out.println("Girdiginiz sayilarin ortalamasi: " + ortalama);


    }
}
