import java.util.Calendar;
import java.util.Date;
import java.util.Vector;


public class abcd {

	public static void main(String args[])
	{
		Vector<String> a = new Vector<String>();
		a.addElement("asd");
		System.out.print(a.firstElement());
		
		Date d =new Date();
		
		Calendar c=Calendar.getInstance();
		int secs=c.get(Calendar.MILLISECOND);
		System.out.println(""+c.getTimeInMillis()+c.get(Calendar.MILLISECOND));		
				
	}
}
