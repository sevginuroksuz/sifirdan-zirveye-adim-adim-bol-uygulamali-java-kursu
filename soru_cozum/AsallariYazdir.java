package soru_cozum;

import java.util.Scanner;

public class AsallariYazdir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Asal sayilari hangi sayiya kadar yazdirmak istiyorsunuz: ");

        int kacaKadar = in.nextInt();
        int kacTane=0;
        int [] dizi = new int[50];
        int j=0;
        for (int sayi = 2; sayi <= kacaKadar; sayi++) {

            int kontrol = 0;

            for (int i = 2; i < sayi; i++)

                if (sayi % i == 0) {
                    kontrol = 1;
                    break;

                }

            if (kontrol == 0) {
                     dizi[j]=sayi;
                     kacTane++;
                     j++;


            }
        }
        for(int i=0; i<(kacTane-1); i++)
            System.out.print(dizi[i] + ", ");

        System.out.println(dizi[(kacTane-1)]);
    }
}

