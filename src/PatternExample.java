import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternExample {
	
	public static void main(String args[])
	{
		Pattern p = Pattern.compile("[abca1]");
		/*
	 	A compiled representation of a regular expression.
		
		A regular expression, specified as a string, must first be compiled into an instance of this class. 
		The resulting pattern can then be used to create a Matcher object that can match arbitrary 
		character sequences against the regular expression.
		
		 */
		Matcher m = p.matcher("1");
		/*
		Creates a matcher that will match the given input against this pattern.
		Parameters:
		input - The character sequence to be matched
		Returns:
		A new matcher for this pattern
		*/
		boolean b = m.matches();//Attempts to match the entire input sequence against the pattern.
		System.out.println(b);
	}
}
