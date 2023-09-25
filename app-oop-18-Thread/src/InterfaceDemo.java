
public class InterfaceDemo implements Runnable{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		InterfaceDemo id=new InterfaceDemo();
		Thread t=new Thread(id);
		t.start();
	}
}
