
public class seperateUrlAndFileName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://www.castrolcricket.com/images/player_thumb/mitchell_johnson_thumb.jpg?v=11111";	//+"abcabc##"+"xyz.jpg";
		
		String actualUrl="";
		String filename="";
		String seperator="abcabc##";
		if(url.indexOf(seperator)!=-1)
		{
			actualUrl=url.substring(0, url.indexOf(seperator));
			filename=url.substring(url.indexOf(seperator)+seperator.length(), url.length());
		}else{
			actualUrl=url;
			filename=String.valueOf(url.hashCode());
		}
		
		System.out.println(url);
		System.out.println(actualUrl);
		System.out.println(filename);
		
	}

}
