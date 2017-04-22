import java.text.DateFormat;



public class dateUtilsForCalculationOfTimeStampDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String result = DateUtils.getRelativeTimeSpanString(1306767830, 1306767835, 0);
		long timestamp=1339849097;
		long currentTime=System.currentTimeMillis() / 1000L;
		long diffInSecs=currentTime-timestamp;
		String ago="";
		if(diffInSecs<60)
		{
			ago=diffInSecs+" sec(s) ago";
		}else{
			long mins=diffInSecs/60;
			if(mins<60)
			{
				ago=mins+" min(s) ago";
			}else{
				long hrs=mins/60;
				if(hrs<24)
				{
					ago=hrs+" hr(s) ago";
				}else{
					long day=hrs/24;
					if(day<30)
					{
						ago=day+" day(s) ago";
					}else{
						long month=day/30;
						ago=month+" month(s) ago";
					}
				}
			}
		}
		
		System.out.println(ago);

	}

}
