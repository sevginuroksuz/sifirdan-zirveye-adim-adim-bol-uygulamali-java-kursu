package kontrol_yapilari;

import java.util.Scanner;

public class KullanicidanVeriAlma {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        // nextInt kullanimi
        int kullaniciInt = tara.nextInt();
        System.out.println("Kullanicinin girdigi integer deger: " + kullaniciInt);

        // nextDouble kullanimi
        double kullaniciDouble = tara.nextDouble();
        System.out.println("Kullanicin girdigi double deger: " + kullaniciDouble);

        // next kullanimi
        String isim = tara.next();
        System.out.println("Girilen isim: " + isim);

        tara.nextLine();   // tara.Next ten sonra tara.nextLine i tara.Next goremez.
                           // Bu yüzden pes pese kullanilirlarsa kullanicidan tekrar girdi alinamaz.
                          // Araya bir tane daha tara.nextLine yazildiginda sorun cozulur.

        // nextLine kullanimi
        String isimSoyisim = tara.nextLine();
        System.out.println("Girilen isim soyisim: " + isimSoyisim);

        // Harfler next ile ilk basta string seklinde alinir.
        // charAt fonksiyonu yardimiyla kacinci indisteki harf isteniyorsa fonksiyona harfin Stringteki indisinin degeri girilerek harf alinmis olur.
        char harf = tara.next().charAt(0);
        System.out.println("Girilen harf: " + harf);
    }
}
