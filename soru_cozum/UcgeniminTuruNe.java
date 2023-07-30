package soru_cozum;

import java.util.Scanner;

public class UcgeniminTuruNe {
    public static void main(String[] args) {


        System.out.println("*************************************");
        System.out.println("          UCGENIMIN TURUNU NE        ");
        System.out.println("        UYGULMASINA HOS GELDINIZ..   ");
        System.out.println("***************************************");
        Scanner in = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz: ");
        int kenar1 = in.nextInt();
        int kenar2 = in.nextInt();
        int kenar3 = in.nextInt();

        if ((kenar1 == kenar2) && (kenar2 == kenar3)) {
            System.out.println("Girdiginiz ucgen eskenar ucgendir.");
        }
        else if (kenar2 == kenar3) {
            System.out.println("Girdiginiz ucgen ikizkenar ucgendir.");

        } else if (kenar1 == kenar3) {
            System.out.println("Girdiginiz ucgen ikizkenar ucgendir.");

        } else if(kenar1 == kenar2)
        {
            System.out.println("Girdiginiz ucgen ikizkenar ucgendir.");
        }
        else
        {
            System.out.println("Girdiginiz ucgen cesitkenar ucgendir.");
        }

    }
}
