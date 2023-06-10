
public class Threading {

	public static void main(String[] args) {
		// Thread
		//Thread(new Runnable())
		
		ThreadIslem i1=new ThreadIslem("Ilk");
		Thread t1=new Thread(i1);
		
		ThreadIslem i2=new ThreadIslem("Son");
		Thread t2= new Thread(i2);
		
		t1.start();
		t2.start();

	}

}
