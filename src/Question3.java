
public class Question3 {

	public static void main(String[] args) {

		System.out.println(compress("aaauffsssd"));
	}
	
	public static String compress(String input){
		
		StringBuilder sb=new StringBuilder();
		
		int i=0;
		
		while (i <  input.length()-1) {
			
			char x=input.charAt(i);
			sb.append(x);
			
			int count=1;
			
			boolean nextCharSame=true;
			while (nextCharSame && i <  input.length()-1) {
				char nextChar=input.charAt(i+1);
				i++;
				if(nextChar==x){
					
					count++;
				}else
					nextCharSame=false;
			}
			
			sb.append(count);
		}
		
		String trimmed=sb.toString();
		if(trimmed.length()>input.length())
			return input;
		else 
			return trimmed;
	}

}
