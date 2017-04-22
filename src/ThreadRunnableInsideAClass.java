
public class ThreadRunnableInsideAClass {

	static Thread t;
	
	static synchronized void showPrint(String thread)//static
	{
		System.out.println(thread);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Runnable x=new Runnable() {
			public void run() {
				
				showPrint(Thread.currentThread().getName());
				//make showPrint static for threads
				
			}
		};
		t=new Thread(x,"one");
		t.start();
		
		Thread two=new Thread(x, "two");
		two.start();
		
		Thread three=new Thread(x, "three");
		three.start();
		
		/*
		 *	synchronised works for this as well  
		ThreadRunnableInsideAClass one=new ThreadRunnableInsideAClass();
		ThreadRunnableInsideAClass two=new ThreadRunnableInsideAClass();
		ThreadRunnableInsideAClass three=new ThreadRunnableInsideAClass();
		ThreadRunnableInsideAClass four=new ThreadRunnableInsideAClass();
		ThreadRunnableInsideAClass five=new ThreadRunnableInsideAClass();
		
		one.showPrint("1");
		five.showPrint("5");
		three.showPrint("3");
		two.showPrint("2");
		four.showPrint("4");
		one.showPrint("1");*/
		
		//order is maintained in both 

	}

}
