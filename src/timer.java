import java.util.Timer;
import java.util.TimerTask;


public class timer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer t=new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("repeat");
			}
			
		}, 1000, 1000);

	}

}
