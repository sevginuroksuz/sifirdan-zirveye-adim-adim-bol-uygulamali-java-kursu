package soru_cozum;

import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("==============================================================");
        System.out.println("                     EKOK BULMA PROGRAMI                   ");
        System.out.println("==============================================================");
        System.out.println("Ekokunu bulkmak istediginiz sayilari girin:");
        int sayi1 = in.nextInt();
        int sayi2 = in.nextInt();
        int ekok = 1;
        for (int i=1; i<=sayi1 && i<=sayi2; i++)
        {
            if (sayi1 % i == 0 && sayi2 % i == 0)
                ekok = i;
        }


        System.out.println("Ekok: " + ekok);
    }
}
