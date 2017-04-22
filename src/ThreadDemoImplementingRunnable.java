
public class ThreadDemoImplementingRunnable implements Runnable {

	
	/*
	 * 
	 * public void run()
When an object implementing interface Runnable is used to create a thread, 
starting the thread causes the object's run method to be called in that separately executing thread.

way to create a thread is to declare a class that implements the Runnable interface. 
That class then implements the run method. An instance of the class can then be allocated, 
passed as an argument when creating Thread, and started. 
	 * */
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("on new thread");
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread());
		
		//object implementing interface Runnable aka  ThreadDemoImplementingRunnable
		Thread t=new Thread(new ThreadDemoImplementingRunnable());
		t.start();
	}

}
