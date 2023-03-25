package kontrol_yapilari;

public class WhileDoWhileDonguleri {
    public static void main(String[] args) {

        int sayi=6;

        while(sayi<13)           // while
        {
            System.out.println("Merhaba sayi: " + sayi);
            sayi++;
        }

        for(int i=6; i<13;i++)        // for hali
        {
            System.out.println("For dongusu merhaba sayi: " + i);
        }

        int sayac = 0;
        do                    // do while
        {
            System.out.println("Selamun Aleykum");
            sayac++;

        }while (sayac<99);
    }
}
