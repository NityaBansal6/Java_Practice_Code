
public class Main1 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+ " is started");
		System.out.println("Priority of this thread is : "+t.getPriority());
		System.out.println("Changing Name and Priority");
		t.setName("Nitya Thread");
		t.setPriority(8);
	    System.out.println("Suspending this thread for 5 sec");
	    try {
	    Thread.sleep(5000);
	}catch(Exception e) {
		System.out.println(e);
	}
	    System.out.println("Execution of thread is resumed");
	    System.out.println("Name and priority after change");
	    System.out.println(t.getName()+" "+t.getPriority());
}
}