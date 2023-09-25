class A extends Thread{
	public void run() {
		
	}
}
class B extends Thread{
	public void run() {
		
	}
}
public class MainDem extends Thread{
	public static void main(String[] args) {
		Thread th=new Thread();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(th.isAlive());
		A a=new A();
		B b=new B();
		a.start();
		b.start();
		th.start();
		System.out.println(th.isAlive());
		System.out.println(Thread.activeCount());
	}
}
