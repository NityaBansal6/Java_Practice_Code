class UserThread extends Thread{
	public void run() {
		System.out.println("User thread is started!!!");
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("User Thread is terminated");
	}
}
public class MyThread {
	public static void main(String[] args) {
		System.out.println("Main Thread is started, starting user thread");
		UserThread td=new UserThread();
		td.start();
		for(int i=1000;i<2000;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			try
			{
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	    System.out.println("Main Thread is Terminated");
	}
}
