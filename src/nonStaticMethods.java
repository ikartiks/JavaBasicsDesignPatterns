import java.awt.print.Printable;


public class nonStaticMethods {
	
	void print(String abc)
	{
		System.out.println(abc);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nonStaticMethods a=new nonStaticMethods();
		a.print("abcdef");
	}

}
