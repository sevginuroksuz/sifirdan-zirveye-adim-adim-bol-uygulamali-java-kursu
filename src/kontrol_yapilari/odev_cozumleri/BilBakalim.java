package kontrol_yapilari.odev_cozumleri;

import java.util.Scanner;

public class BilBakalim {

    public static void main(String[] args) {

        int sayi = (int)(Math.random() * 99 + 1);

        Scanner tahmin = new Scanner(System.in);

        System.out.println("*********************************************************");
        System.out.println("                BIL BAKALIMA HOS GELDIN                  ");
        System.out.println("*********************************************************");
        System.out.println("Bil bakalim hangi sayi? ");
        int tahminEt = tahmin.nextInt();

        if(sayi == tahminEt)
        {
            System.out.println("Tebrikler bildin! 10.000 TL kazandin!!!");
        } else
        {
            String sayiString = String.valueOf(sayi);
            String tahminEtString = String.valueOf(tahminEt);
           if(tahminEtString.charAt(1)==sayiString.charAt(0) && tahminEtString.charAt(0)==sayiString.charAt(1))
           {
               System.out.println("Tebrikler 5.000 TL kazandin!!!");
           } else if (tahminEtString.charAt(1)== sayiString.charAt(0) || tahminEtString.charAt(0)==sayiString.charAt(1)) {
               System.out.println("Tebrikler 1.000 TL kazandin!!!");
           } else if (tahminEtString.charAt(1)==sayiString.charAt(1) || tahminEtString.charAt(0) == sayiString.charAt(0)) {
               System.out.println("Tebrikler 1.000 TL kazandin!!!");
           }
               else
               {
                   System.out.println("Uzgunuz bir sey kazanamadin :(");
               }
           }


        System.out.println("Sayi: " + sayi);
        System.out.println("Tahmin: " + tahminEt);



    }
}
