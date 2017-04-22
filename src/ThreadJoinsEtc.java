import java.lang.Thread;
import java.lang.Runnable;

public class ThreadJoinsEtc {
	
	synchronized void foo(){
		
		System.out.println("foo called "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("trying to call bar "+Thread.currentThread().getName());
		bar();
		
	} 
	
	synchronized void bar(){
		
		System.out.println("bar called "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("trying to call foo "+Thread.currentThread().getName());
		foo();
	} 

	public static void main(String[] args) {
		
		
		//static keyword on foo n bar for 1st 2 programs
		/*System.out.println("main started");
		
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("theread end");
			}
		});
		t.start();
		
		try {
			t.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main finished");
		
		
			 without join op :
				main started
				main finished
				theread end
			
			with join output
				main started
				theread end
				main finished
				
			
			*/
		
		//------------JOINS end
		
		//deadlock starts
		/*Thread.currentThread().setName("main thread");
		foo();
		
		
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				
				
				bar();
				
			}
		});
		t.setName("new ");
		t.start();
		
		
		//above program runs perfectly fine,only bar is never called froom new thread , that is beacause lock is always sety on the 
		//object and corrosponding method rather than piece of code
		*/
		
		/*Think of a race condition using the traditional example. Say you and a friend have an ATM cards for the same bank account. Now suppose the account has $100 in it. Consider what happens when you attempt to withdraw $10 and your friend attempts to withdraw $50 at exactly the same time.

		Think about what has to happen. The ATM machine must take your input, read what is currently in your account, and then modify the amount. Note, that in programming terms, an assignment statement is a multi-step process.

		So, label both of your transactions T1 (you withdraw $10), and T2 (your friend withdraws $50). Now, the numbers below, to the left, represent time steps.

		       T1                        T2
		       ----------------          ------------------------
		 1.    Read Acct ($100)          
		 2.                              Read Acct ($100)
		 3.    Write New Amt ($90)
		 4.                              Write New Amt ($50)
		 5.                              End
		 6.    End
		After both transactions complete, using this timeline, which is possible if you don't use any sort of locking mechanism, the account has $50 in it. This is $10 more than it should (your transaction is lost forever, but you still have the money).

		This is a called race condition. What you want is for the transaction to be serializable, that is in no matter how you interleave the individual instruction executions, the end result will be the exact same as some serial schedule (meaning you run them one after the other with no interleaving) of the same transactions. 
		*/
		new Thread(new Runnable() {
			public void run() {
			
				Thread.currentThread().setName("ONE");
				ThreadJoinsEtc a=new ThreadJoinsEtc();
				a.foo();
			}
		}).start();
		
		
		
		new Thread(new Runnable() {
			public void run() {
				
				Thread.currentThread().setName("TWO");
				ThreadJoinsEtc b=new ThreadJoinsEtc();
				b.bar();
			}
		}).start();

	}

}
