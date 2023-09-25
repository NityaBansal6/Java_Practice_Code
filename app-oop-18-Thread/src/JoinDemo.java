
public class JoinDemo implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		}
		System.out.println(Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		JoinDemo jd=new JoinDemo();
		Thread th=new Thread(jd,"Nitya");  //Thread(Runnable, String)
		Thread th1=new Thread(jd,"kush");
		Thread th2=new Thread(jd,"Naman");
		th.start();
		th1.start();
		th2.start();
	}
}
