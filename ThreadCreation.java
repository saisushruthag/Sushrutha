package multithread;

public class ThreadCreation extends Thread {
	String threadName;
	public ThreadCreation(String thread) {
		
		this.threadName=thread;
		
	}
	public void run() {
		System.out.println("thread execution of "+threadName);
	}
	public static void main(String args[]) {
		
		ThreadCreation object1=new ThreadCreation("thread");
		Thread thre=new Thread(object1);
		thre.start();
		
		ThreadCreation object2=new ThreadCreation("thread1");
		Thread threa=new Thread(object2);
		threa.start();

	}

}
