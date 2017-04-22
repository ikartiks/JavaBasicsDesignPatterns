
public class illegalCharacterException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="https://www.hamarisuraksha.com/web/webservice/HamariSurakshaMobile.asmx/addUpdateEmergencyContact?Id=8A8DDB34-4F57-E311-A094-005056B9013D&SrNo=0&FirstName=Mummy Ji&LastName=&StdCode=91&Phone=8510033244&Country=INDIA&Email=";
		String beforeException=x.substring(0,160);
		String afterException=x.substring(160,x.length());
		
		System.out.println("b4 "+beforeException);
		System.out.println("after "+afterException);
	}

}
