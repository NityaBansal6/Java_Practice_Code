class User extends Thread{
	public void run() {
		for(int i=0;i<2;i++)
			System.out.println(i);
	}
}
public class UserThreadMain {
	static public void main(String... args) {
		User child=new User();
		child.start();
		child.start();// Illegal Thread State Exception
		for(int i=0;i<5;i++)
			System.out.println("Nitya");
	}
}
// In this case Main thread get Terminated but Child Thread Runs Successfully