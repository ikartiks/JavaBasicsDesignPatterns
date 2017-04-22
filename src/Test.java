import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/*class TrickyNum<X extends Object> {

	private X x;

	public TrickyNum(X x) {
		this.x = x;
	}

	double getDouble() {
		return ((Double) x).doubleValue();
	}

}

public class Test {

	public static void main(String args[]) {
		Object myObj = new String[] { "one", "two", "three" };
		{
			for (String s : (String[]) myObj)
				System.out.print(s + ".");
		}

		TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
		System.out.print(a.getDouble());
		//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double

	}

}
*/

/*
 
 ans unknown
 
 
 public class Test { 
 
    public static void main(String args[]) {
        String prop = System.getenv("myprop");//some code goes here//;
        System.out.print(prop);
    }
}*/

/*class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Test {
    public static void main(String[] args) {
        
    	DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
    	Calendar c = Calendar.getInstance();
    	c.set(Calendar.YEAR, 2009);
    	c.set(Calendar.MONTH, 6);
    	c.set(Calendar.DAY_OF_MONTH, 1);
    	String formattedDate = df.format(c.getTime());
    	System.out.println(formattedDate);//July 1, 2009
    	
    		Vehicle v = new Car();
        Bike b = (Bike) v;
        //Car cannot be cast to Bike java.lang.ClassCastException:
        //savaal
        
        v.printSound();
        b.printSound();
    }   
}*/

/*class TrickyNum<X extends Number> {
    
    private X x;
    
    public TrickyNum(X x) {
        this.x = x;
    }
    
    public double getDouble() {
        return x.doubleValue();
    }
    
    
}

public class Test {
	
	public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());//1.0 extends Number
        
        String test = "This is a test string";
        String[] tokens = test.split("\s");
        //Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
        System.out.println(tokens.length);
    }
}*/