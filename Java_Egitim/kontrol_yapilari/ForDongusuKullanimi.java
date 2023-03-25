package kontrol_yapilari;

public class ForDongusuKullanimi {
    public static void main(String[] args) {

        // For ( ilk atama; for dongusunun calisma sarti; her calisma sonrasi ne olacagi)

        for(int i=0; i<10; i++)    // klasik for dongusu
        {
            System.out.println("Sevgi Nur Oksuz");
            System.out.println("Java ogreniyorum.");
            System.out.println("i'nin degeriz: " + i);
        }

        for(int i=0, j=0; (i + j) < 10; i++, j++ )     // iki degiskenli for dongusu
        {
            System.out.println("i'nin degeri: " + i + " j'nin degeri: " + j);
        }

        for(;;)                // sonsuz dongu
            System.out.println("Sevgi");

        // for dongusunun sonuna noktali virgul konulmaz.
        for( int i=0, j=0; (i+j) < 10; i++, j++) ;
        {
            System.out.println("Sevgi");
        }


        // ic ice for dongusu
        for( int i=0, j=0; (i+j) < 10; i++, j++) 
        {
            for( int i=0, j=0; (i+j) < 10; i++, j++) 
            {
                System.out.println("Sevgi");
            }

            System.out.println("Sevgi");
        }



    }
}
