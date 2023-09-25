class 	Mai{
	StringBuilder sb=new StringBuilder("Nitya");
	void add() {
		sb=sb.append("Bansal");
	}
}
class Thread_2 extends Thread{
	Mai a;
	Thread_2(Mai a){
		this.a=a;
	}
	public void run() {
		a.add();
	}
}
class Thread_3 extends Thread{
	Mai a;
	Thread_3(Mai a){
		this.a=a;
	}
    public void run() {
    	a.add();
	}
}
public class StringBufferModifiableClass{
	public static void main(String[] args) {
	Mai a=new Mai();
	Thread_2 t2=new Thread_2(a);
	Thread_3 t3=new Thread_3(a);
	t2.start();
	t3.start();
	
}
}
