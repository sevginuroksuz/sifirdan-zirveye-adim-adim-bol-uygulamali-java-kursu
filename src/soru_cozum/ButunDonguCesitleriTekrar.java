package soru_cozum;

import java.util.Scanner;

public class ButunDonguCesitleriTekrar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String isim = in.nextLine();

        // for dongusu
        for( int i=1; i<6; i++)
        {
            System.out.println(isim);
        }




        // while dongusu
        int i=0;
        while (i<5){
            System.out.println(isim);
            i++;
        }



        // do while dongusu
        int k=0;
        do{
            System.out.println(isim);
            k++;
        } while (k<5);


    }
}
