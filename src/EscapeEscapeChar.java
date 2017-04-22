
public class EscapeEscapeChar {
	
public static void main(String[] args) {
		
		String x="kartika\\asd";
		System.out.println(x);
		
		//if u add only to the escape character mayb escaped in 
		//the replace all function
		x=x.replaceAll("\\\\", "");
		System.out.println(x);
	}
}
