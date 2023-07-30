package kontrol_yapilari.odevvecozumleri;

import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {
        /*
        Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)
        */

        Scanner in = new Scanner(System.in);
        System.out.println("Kilo (kg): ");
        double kilo = in.nextDouble();
        System.out.println("Boy (cm): ");
        int boy = in.nextInt();

        double VKI = kilo / Math.pow((boy / 100.0),2);

        if(VKI < 15.0 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("Cok ciddi derecede dusuk kilolu");
        }
          else if ( VKI < 16 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("Ciddi derecede dusuk kilolu");
        }
          else if ( VKI < 18.5 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("Dusuk kilolu");
        }
          else if ( VKI < 25 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("Normal (saglikli) kilolu");
        }
          else if ( VKI < 30 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("Fazla kilolu");
        }
        else if ( VKI < 35 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("1. dereceden (hafif) obez");
        }
        else if ( VKI < 40 ) {
            System.out.println("VKI: " + VKI);
            System.out.println("2. dereceden (ciddi) obez");
        }
        else {
            System.out.println("VKI: " + VKI);
            System.out.println("3. dereceden (cok ciddi) obez");
        }


    }
}
