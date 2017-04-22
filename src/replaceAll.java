/**
 * 
 */

/**
 * @author Kartik S
 *
 */
public class replaceAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String phone="98 70 659145";
		phone=phone.replaceAll(" ", "");
        if(!phone.startsWith("91")){
        	phone="91"+phone;
        	
        }
        
        
        System.out.println(phone);
	}

}
