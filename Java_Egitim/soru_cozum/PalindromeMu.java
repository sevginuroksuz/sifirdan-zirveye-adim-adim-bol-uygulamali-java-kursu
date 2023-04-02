package soru_cozum;

import java.util.Scanner;

public class PalindromeMu {
    public static void main(String[] args) {

        System.out.println("*********************************************************");
        System.out.println("                      PALINDROM MU ?              ");
        System.out.println("*********************************************************");
        Scanner tara = new Scanner(System.in);
        System.out.println("Metni giriniz: ");
        String metin = tara.nextLine();
        int metinUzunluk = metin.length();
        int dongu = metinUzunluk / 2;
        int sayac =0;

        for (int i=0; i< dongu; i++)
        {
            if(metin.charAt(i) == metin.charAt(metinUzunluk-i-1))
                sayac++;
        }
        if(sayac==dongu)
            System.out.println("Bu metin palindromdur.");
        else
            System.out.println("bu metin palindrom degildir.");
    }
}
