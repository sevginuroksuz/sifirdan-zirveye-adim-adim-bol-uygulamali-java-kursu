package soru_cozum;

import java.util.Scanner;

public class SicakSogukOyunu {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                          SICAK SOGUK OYUNUMUZA HOS GELDINIZ                     ");
        System.out.println("-----------------------------------------------------------------------------------");
        Scanner in = new Scanner(System.in);

        int sayi = (int) (Math.random()*99 +1);
        System.out.print("                       Tahmin et bakalim: ");
        int tahmin = in.nextInt();

        while (true)
        {
            if(tahmin<sayi)
            {
                System.out.print("                       Yavas gittin. Biraz daha artir: ");
                tahmin = in.nextInt();
            } else if ( tahmin > sayi ) {
                System.out.print("                       Opps! Cok soyledin. Biraz in: ");
                tahmin = in.nextInt();
            }
            else {
                System.out.print("                       Tebrikler bildin!");
                break;
            }
        }


    }

}
