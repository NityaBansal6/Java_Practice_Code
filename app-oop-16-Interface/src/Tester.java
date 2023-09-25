interface Inter{
	public static final int FEE=20;
	public abstract void disp();
}
public class Tester implements Inter{
	public void disp() {
		System.out.println("Now, I have the body");
	}
	public static void main(String[] args) {
		System.out.println("The Fees is : "+FEE);
		Tester ts=new Tester();
		ts.disp();
		Inter it=new Tester(); //Upcasting
		it.disp();
	}
}
