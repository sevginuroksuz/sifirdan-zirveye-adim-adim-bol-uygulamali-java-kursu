
public class Islemler {

//Thread kullanýlmadan.
	
    public static void main(String[] args) {
        uzunBirIslem();
        System.out.println("Merhaba Thread");
    }

    private static void uzunBirIslem() {
        try {
            // Burada uzun bir islem yapýlýyor.
            Thread.sleep(5 * 1000);
            System.out.println("Uzun islem sonucu");
        } catch (InterruptedException ex) {
            System.err.println(ex);
        } 
    }

}