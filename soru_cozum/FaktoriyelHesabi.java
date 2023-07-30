package soru_cozum;

import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {

        System.out.println("***************************************");
        System.out.println("            FAKTORIYEL HESAPLA         ");
        System.out.println("***************************************");
        Scanner in = new Scanner(System.in);
        System.out.print("Kac faktoriyel hesaplamak istiyorsunuz? ");
        int sayi = in.nextInt();
        int i=1, faktoriyel=1;
        while(i<=sayi){
            faktoriyel *= i;
            i++;
        }
        System.out.println(sayi + "! = " + faktoriyel);

    }
}
