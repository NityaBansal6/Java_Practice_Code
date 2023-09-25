// For Main Thread

public class ForTest {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t.getName()+" is started which is thread");
		System.out.println("Default Priority is "+t.getPriority());
	    t.setName("default");
		t.setPriority(7);
		System.out.println("Suspending this thread for 5sec");
		try {
			Thread.sleep(5000);   // 1sec= 1000
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Execution of thread is resumed");
		System.out.println("Name and Priority after change");
		System.out.println("Name :"+t.getName()+"\nPriority :"+t.getPriority());
	}
}
