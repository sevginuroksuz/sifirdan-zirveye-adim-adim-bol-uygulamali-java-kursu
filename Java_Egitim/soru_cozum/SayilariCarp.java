package soru_cozum;

import java.util.Scanner;

public class SayilariCarp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int carpim = 1;
        while (true)
        {
            System.out.print("Bir sayi giriniz: ");
            int sayi = in.nextInt();
            if(sayi == 0)
            {
                break;
            }
            carpim *= sayi;
        }
        System.out.print("Sayilarin carpimi: " + carpim);

    }
}
