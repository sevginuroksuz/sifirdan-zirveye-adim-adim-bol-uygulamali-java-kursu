package operatorler;

public class IliskiselKarsilastirmaMantiksalOperator {
    public static void main(String[] args) {

        int sayi1 = 40;
        int sayi2 = 76;

        System.out.println("sayi1 esit mi sayi2 ye: " + (sayi1 == sayi2));
        System.out.println("sayi1 kucuk mu sayi2 den: " + (sayi1 < sayi2));
        System.out.println("sayi1 buyuk mu sayi2 den: " + (sayi1 > sayi2));
        System.out.println("sayi1 kucuk esit mi sayi2 den: " + (sayi1 <= sayi2));
        System.out.println("sayi1 buyuk esit mi sayi2 ye: " + (sayi1 >= sayi2));
        System.out.println("sayi1 esit degil mi sayi2 ye: " + (sayi1 != sayi2));

        if(sayi1 < sayi2 ){

            System.out.println("sayi1 sayi2 den kucuktur");
        }
        else
            System.out.println("sayi1 sayi2 den buyuktur");

        boolean deger1 = true;
        boolean deger2 = false;

        System.out.println("deger1 && deger2: " + (deger1 && deger2));
        System.out.println("deger1 || deger2: " + (deger1 || deger2));

        int benimYasim = 21;
        int onunYasi = 25;

        if(benimYasim < 25 && onunYasi > 30){
            System.out.println("Birinci ifade calisti.");
        } else if (benimYasim > 23 && onunYasi <26) {
            System.out.println("Ikinci ifade calisti.");

        } else{
            System.out.println("Ikinci ifadenin else kismi calisti.");
        }
        
    }
}

