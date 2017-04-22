
public class ThreadDemoExtendingThread extends Thread {
	
	public void run()
	{
		System.out.println("on new thread");
		System.out.println(Thread.currentThread());
		
	}
	
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread());
		ThreadDemoExtendingThread d=new ThreadDemoExtendingThread();
		d.start();
	}

}
