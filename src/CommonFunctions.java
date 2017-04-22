import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CommonFunctions {
	
	static public String getCurrentDate(){
		String currentDate = "";
		SimpleDateFormat gmtDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.000");
		gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		currentDate =  gmtDateFormat.format(new Date());
		
		//System.out.println("Current Date and Time in GMT+5:30 time zone: " + gmtDateFormat.format(new Date()));
		return currentDate;
	}
	
	static public String getCurrentDateUser(){
		String currentDate = "";
		SimpleDateFormat gmtDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		currentDate =  gmtDateFormat.format(new Date());

		//System.out.println("Current Date and Time in GMT+5:30 time zone: " + gmtDateFormat.format(new Date()));
		return currentDate;
	}
	
	
}
