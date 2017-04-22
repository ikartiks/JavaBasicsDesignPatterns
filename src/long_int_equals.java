import java.util.Enumeration;
import java.util.Vector;


public class long_int_equals {
	
	public static void main(String arg[])
	{
		int x=22222222;
		double xi=22222222.0;
		if(x==xi)
		{
			System.out.println("works");
		}
		
		String fbid="100003582706638";
		long fb=Long.parseLong(fbid);
		System.out.println(fb);
		
		long[] asd=new long[10];
		asd[0]=fb;
		String asdString="";
		for (int i = 0; i < asd.length; i++) {
			if(i==0)
			{
				asdString+=asd[i];
			}else{
				asdString+=","+asd[i];
			}
		}
		
		System.out.println(asdString);
		
		String []items={"ads","kas","rasd","cdee","momo"};
		System.out.println(items.toString());
		
		Vector v =new Vector();
		v.add("abc");
		v.add("asd");
		v.add("kartik");
		v.add("shah");
		
		System.out.println("capacity"+v.capacity());
		for (int i = 0; i < v.size(); i++) {
			
			System.out.println(v.elementAt(i));
			
		}
		
		
	}

}
