import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class StringSeperated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String x="aaa#**&&**#bbbbb#**&&**#ccccc#**&&**#";
		int i;
		
		/*i=x.indexOf("#**&&**#");
		System.out.println(i);
		x=x.substring(i+8, x.length());
		System.out.println(x);
		*/
		
		ArrayList< String> params=new ArrayList<String>();
		
		while(((i=x.indexOf("#**&&**#"))!=-1))
		{
			String a=x.substring(0, i);
			System.out.println(a);
			x=x.substring(i+8, x.length());
			params.add(a);		
		}
		//x.in
		
		System.out.println(params.toString());
		
		try {
		    // Convert from Unicode to UTF-8
		    String string = "abc\u5639\u563b\u00ea \b \u00ea";
		    System.out.println(string);
		    byte[] utf8 = string.getBytes("UTF-8");

		    // Convert from UTF-8 to Unicode
		    string = new String(utf8, "UTF-8");
		    System.out.println(string);
		} catch (UnsupportedEncodingException e) {
		}

	}

}
