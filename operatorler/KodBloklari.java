package operatorler;

public class KodBloklari {
    public static void main(String[] args) {

        int seviye1Blok1 = 24;
        {
            System.out.println(seviye1Blok1);

            int seviye1Blok2 = 35;                    // Kod blokları degiskenlerin kapsam alanını belirler.
            {
                System.out.println(seviye1Blok1);
                System.out.println(seviye1Blok2);

                int seviye1Blok3 = 45;
                {
                    System.out.println(seviye1Blok1);
                    System.out.println(seviye1Blok2);
                    System.out.println(seviye1Blok3);
                }

            }
        }

        int seviye1Blok4 = 12;                 // seviye1Blok2 ve seviye1Blok3 degiskenleri bu alanda gecerli degillerdir.
        {
            System.out.println(seviye1Blok1);
            System.out.println(seviye1Blok4);
        }
    }
}
