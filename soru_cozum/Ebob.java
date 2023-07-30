package soru_cozum;

import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {

        System.out.println("===========================================================================");
        System.out.println("                           EBOB BULMA PROGRAMI                             ");
        System.out.println("===========================================================================");
        Scanner in = new Scanner(System.in);
        int ebob =0;
        System.out.println("En buyuk ortak bolenini bulmak istediginiz sayilar:");
        int sayi1 = in.nextInt();
        int sayi2 = in.nextInt();

         for(int i=1; i<=sayi1 && i<=sayi2; i++) {
             if (sayi1 % i == 0 && sayi2 % i == 0)
                 ebob = i;
         }

         System.out.println("En buyuk ortak bolen: " + ebob);



    }
}
