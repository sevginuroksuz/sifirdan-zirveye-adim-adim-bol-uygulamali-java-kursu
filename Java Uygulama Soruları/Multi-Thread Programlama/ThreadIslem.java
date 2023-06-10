
public class ThreadIslem implements Runnable {
	
	String islem;

	
	public ThreadIslem(String islem) {
		this.islem = islem;
	}




	@Override
	public void run() {
		
		try {
			
		for(int i=5;i>0;i--)
			
		{
			System.out.println(this.islem+" : " + i);
			Thread.sleep(1000);
		} 
		}
	
		catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(this.islem +"hata ile karsilasildi");
			}
		System.out.println(islem +" islem bitti");
		
	}
	}


