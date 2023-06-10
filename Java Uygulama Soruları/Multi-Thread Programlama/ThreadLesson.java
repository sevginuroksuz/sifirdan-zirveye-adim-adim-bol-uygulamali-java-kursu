
public class ThreadLesson {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("thread1", 6));
        Thread thread2 = new Thread(new MyThread("thread2", 5), "thread2");
        thread1.start();
        thread2.start();
    }
	}
