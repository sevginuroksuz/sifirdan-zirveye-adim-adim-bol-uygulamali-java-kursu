package kontrol_yapilari;

public class IfElseKullanimi {

    public static void main(String[] args) {

        int benimYasim = 30;
        int onunYasi = 24;

        if(benimYasim > onunYasi)
        {
            System.out.println("Ben senden buyugum.");
        } else if (benimYasim < onunYasi)
        {
            System.out.println("Ben senden kucugum.");
        }
        else
        {
            System.out.println("Biz yasitiz.");
        }
        System.out.println("Program sonlandi.");

        int sayi = 16;

        if( sayi > 5 )
        {
            System.out.println("Sayi 5'ten buyuk.");
        }
        if( sayi < 10 )
        {
            System.out.println("Sayi 10'dan kucuk.");
            System.out.println("Program yeniden sonlandi.");
        }

        int sayi1 = 10, sayi2 = 5;

        if( sayi1 > sayi2 )
        if(sayi1>0)

            System.out.println("sayi1 sayi2'den ve 0'dan buyuk.");

        else
            System.out.println("sayi1 sayi2'den ve 0'dan kucuk.");

        boolean sonuc = true;

        if (sonuc == true)      // yanlis!
                                // bu sekilde yazilmasina gerek yok. if parantezi icine yazilan boolean deger true ise if blogu calisir.
        {

        }

        if(sonuc)        // dogru
        {

        }

        int a=19, b=5, c=3;

        if(a>b)                        // if-else
            c = a - b;
        else
            c = a + b;
        System.out.println("c'nin degeri: " + c);

        c = ( a > b ) ? ( a - b ) : ( a + b );       // ternary
        System.out.println("c'nin degeri: " + c);





    }
}
