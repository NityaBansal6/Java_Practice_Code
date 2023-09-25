class Ap{
	String str="CCTeam";
	void m1(){
		str=str+" "+"Software";
		str=str+" "+"Solution";
		System.out.println(Thread.currentThread().getName()+" :"+str);
	}
}
class Thread1 extends Thread{
	Ap a;
	Thread1(Ap a){
		this.a=a;
	}
	public void run() {
		a.m1();
	}
}
class Thread2 extends Thread{
	Ap a;
	Thread2(Ap a){
		this.a=a;
	}
	public void run() {
		a.m1();
	}
}
class Thread3 extends Thread{
	Ap a;
	Thread3(Ap a){
		this.a=a;
	}
	public void run() {
		a.m1();
	}
}
public class ThreadMainDemo{
	public static void main(String[] args) {
		Ap a= new Ap();
		Thread1 t1= new Thread1(a);
		Thread2 t2= new Thread2(a);
		Thread3 t3= new Thread3(a);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}
}
