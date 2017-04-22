
public class Encryption {
	
	String key;
	
	public Encryption() {
		
	}
	
	public Encryption(String key) {
		this.key=key;
	}
	
	public String encrypt(String value){
		
		if(this.key==null)
			return value;
		
		String op = null;
		for (int i = 0; i < value.length(); i++) {
			
			char curr=value.charAt(i);
			String keychar=key.substring((i%key.length())-1, 1);
			char keyCharchar=keychar.charAt(0);
			int currentAscii=(int)curr;
			int keycharAscii=(int)keyCharchar;
			
			char encChar=(char) (currentAscii+keycharAscii);
			op+=encChar;
		}
		
		
		//op=Base64.encodeToString(op.getBytes(), Base64.DEFAULT);
		return op;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Encryption e=new Encryption();
		e.encrypt("kartik");
		

	}

}
