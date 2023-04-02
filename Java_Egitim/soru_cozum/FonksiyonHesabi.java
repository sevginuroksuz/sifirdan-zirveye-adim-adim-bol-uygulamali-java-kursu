package soru_cozum;

import java.util.Scanner;

public class FonksiyonHesabi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("x: ");
        int x = in.nextInt();
        System.out.println("y: ");
        int y = in.nextInt();
        int sonuc=0;
        if( x>0 && y<0)
        {
            sonuc = 4*x + 2*y + 4;
            System.out.println("f(" + x + "," + y +") = " + sonuc);
        } else if (x<0 && y>0) {

            sonuc = 3*x + 4*y +3;
            System.out.println("f(" + x + "," + y +") = " + sonuc);
        } else if (x>0 && y==0) {

            sonuc = 2*x -y + 3;
            System.out.println("f(" + x + "," + y +") = " + sonuc);

        }
        else
        {
            System.out.println("Fonksiyon bu aralikta tanimli degil!");
        }

    }
}
