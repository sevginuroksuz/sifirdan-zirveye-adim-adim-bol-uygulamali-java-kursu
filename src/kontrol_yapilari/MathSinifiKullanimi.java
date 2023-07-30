package kontrol_yapilari;

public class MathSinifiKullanimi {

    public static void main(String[] args) {

        System.out.println("PI sayisi: " + Math.PI);
        System.out.println("E sayisi: " + Math.E);

        System.out.println("-1098 in mutlak degeri: " + Math.abs(-1098));

        // ceil (ust degere yuvarlama fonksiyonu) kullanimi
        System.out.println("34.27 in yuvarlanmis degeri: " + Math.ceil(34.27));
        System.out.println("-44.21 in yuvarlanmis degeri: " + Math.ceil(-44.21));

        // pow fonksiyonu kullanimi
        System.out.println("12 nin kupu: " + Math.pow(12,3));
        System.out.println("4 un karesi: " + Math.pow(4,2));

        System.out.println("144 un karekoku: " + Math.sqrt(144));

        System.out.println("Hangisi daha buyuk 5 mi 45 mi? " + Math.max(5,45));
        System.out.println("Hangisi daha kucuk 12 mi 37 mi? " + Math.min(12,37));


        // random fonksiyonu kullanimi
        int onaKadarRastgele = (int) (Math.random() * 10 + 1);
        System.out.println("Ona kadar rastgele sayi: " + onaKadarRastgele);

        double ikiyeKadarRastgele = Math.random() * 2 + 1;
        System.out.println("2 ye kadar rastgele sayi: " + ikiyeKadarRastgele);

        // eger rastgele uretilecek sayinin 0 da olmasini istiyorsaniz
        // Math.random() * ( ustsinir + 1);

        // eger rastgele uretilecek sayinin 0 da olmasini istemiyorsaniz
        // Math.random() * ustsinir + 1;


    }
}
