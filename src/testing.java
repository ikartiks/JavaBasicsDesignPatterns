
public class testing {
	
	public static void main(String args[])
	{
		
		/*
		 19.231378,73.0302
		19.237496,73.037839
		*/

		int x=1;
		//System.out.println("hey ,how u doin???");
		for (double i=19.231378;i<=19.237496;i=i+0.00004)
		{
			x++;
			if(x==146)
				break;
		System.out.print(i+",");
		}
		System.out.println();
		System.out.print(x);
	}

}
