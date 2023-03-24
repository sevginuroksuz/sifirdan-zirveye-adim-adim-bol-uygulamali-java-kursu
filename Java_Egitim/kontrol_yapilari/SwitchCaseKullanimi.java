package kontrol_yapilari;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {

        int haftaninKacinciGunu = 3;

        if(haftaninKacinciGunu == 1)                    // if else
            System.out.println("Pazartesi");
        else if (haftaninKacinciGunu == 2)
            System.out.println("Sali");
        else if (haftaninKacinciGunu == 3)
            System.out.println("Carsamba");
        else if (haftaninKacinciGunu == 4)
            System.out.println("Persembe");
        else if( haftaninKacinciGunu == 5)
            System.out.println("Cuma");
        else if( haftaninKacinciGunu == 6)
            System.out.println("Cumartesi");
        else if ( haftaninKacinciGunu == 7)
            System.out.println("Pazar");
        else
            System.out.println("Yanlis girdi!");

        switch (haftaninKacinciGunu){                      // switch case hali
            case 1:
                System.out.println("Switch Pazartesi");
                break;
            case 2:
                System.out.println("Switch Sali");
                System.out.println("Switch Sali");
                System.out.println("Switch Sali");
                System.out.println("Switch Sali");
                break;
            case 3:
                System.out.println("Switch Carsamba");
                break;
            case 4:
                System.out.println("Switch Persembe");
                break;
            case 5:
                System.out.println("Switch Cuma");
                break;
            case 6:
                System.out.println("Switch Cumartesi");
                break;
            case 7:
                System.out.println("Switch Pazar");
                break;
            default:
                System.out.println("Yanlis bir gun degeri girildi!");
        }
    }
}
