import java.util.regex.Pattern;

public class RemoveSpecialCharacters {
	
	void cal(int x){
		
	}
	
	static int cal (int x,int y){
		return 0;
	}

	public static void main(String[] args) {
		
		String x="  %%##";
		Pattern p=Pattern.compile("[0-9]");
		boolean hasSpChar = p.matcher(x).find();
		System.out.println(hasSpChar);
		
		
		String y=x.replaceAll("[^a-zA-Z0-9 ]", ""); //space after 0-9 to allow single blank space i.e %20 
		System.out.println(y);
		
		
	}
}
