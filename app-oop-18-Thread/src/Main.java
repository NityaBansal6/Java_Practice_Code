class E extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		E obj=new E();
		obj.start();
		
		E obj1=new E();
		obj1.start();
		
		obj1.run(); // we can call it directly but the problem is all things were done in main there is no different stack
		
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
	}
}
