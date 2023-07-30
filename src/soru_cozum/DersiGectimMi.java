package soru_cozum;

import java.util.Scanner;

public class DersiGectimMi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("              DERSI GECTIM MI           ");
        System.out.println("****************************************");
        System.out.println("Vize notunuzu giriniz: ");
        int vize = in.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        int Final = in.nextInt();
        double gectiMi;

        /*  ---------Harf Aralıkları---------
            AA / 90 - 100 / 4.0 / Başarılı
            BA / 80 - 89 / 3.5 / Başarılı
            BB / 75 - 79 / 3.0 / Başarılı
            CB / 70 - 74 / 2.5 / Başarılı
            CC / 60 - 69 / 2.0 / Başarılı
            DC / 50 - 59 / 1.5 / Koşullu Başarılı - Başarısız
            DD / 40 - 49 / 1.0 / Başarısız
            FD / 30 - 39 / 0.5 / Başarısız
            FF / 0 - 29 / 0.0 / Başarısız
        * */

        gectiMi =  vize * 0.4 + Final * 0.6;

        if(gectiMi > 90)
        {
            System.out.println("Harf Notu: AA ");
            System.out.println("Dersi Gecti mi: Gecti ");
        } else if ( gectiMi > 80 ) {
            System.out.println("Harf Notu: BA ");
            System.out.println("Dersi Gecti mi: Gecti ");
        } else if ( gectiMi > 75 ) {
            System.out.println("Harf Notu: BB ");
            System.out.println("Dersi Gecti mi: Gecti ");

        } else if ( gectiMi > 70) {
            System.out.println("Harf Notu: CB ");
            System.out.println("Dersi Gecti mi: Gecti ");
        } else if ( gectiMi > 60 ) {
            System.out.println("Harf Notu: CC ");
            System.out.println("Dersi Gecti mi: Gecti ");

        } else if ( gectiMi > 50) {
            System.out.println("Harf Notu: DC ");
            System.out.println("Dersi Gecti mi: Kosullu Gecti ");
        } else if ( gectiMi > 40) {
            System.out.println("Harf Notu: DD ");
            System.out.println("Dersi Gecti mi: Kaldi ");
        } else if ( gectiMi > 30) {
            System.out.println("Harf Notu: FD ");
            System.out.println("Dersi Gecti mi: Kaldi ");
        }
        else
        {
            System.out.println("Harf Notu: FF ");
            System.out.println("Dersi Gecti mi: Kaldi ");
        }


    }
}
