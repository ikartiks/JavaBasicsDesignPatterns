
public class charAt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="http://www.royalchallengers.com/ee/index.php/login_signup/login_create_user_ajax/?fb_user_id=100001580982629&name=Kartik Shah&email=skeletalvolvarine666@gmail.com&is_facebook=1&flag=create&is_mobile_app=android";
				
				for(int i=0;i<=120;i++)
				{
					if(i==119||i==120)
					{
						System.out.println(i+"  "+x.charAt(i));
					}
				}

	}

}
