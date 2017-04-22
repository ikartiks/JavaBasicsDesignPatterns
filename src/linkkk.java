public class linkkk {

	/**
	 * @param args
	 */
	static String x="";
	static String web="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println(x);
		x="123";
		System.out.println(x);
		x="";
		System.out.println(x);
		 **/


		String link="abd http://www.royalchallengers.com/asdasda aksdbhabn";
		int i=link.indexOf("http");
		if(i!=-1)
		{
			String linka="";
			for(int j=i;j<link.length();j++)
			{
				if(link.charAt(j)==' ')
				{
					break;
				}
				linka=linka+link.charAt(j);
			}
			System.out.println("link is "+linka);

			if(linka.indexOf("royalchallengers.com")!=-1)
			{
				if(linka.indexOf("https://www")!=-1)
				{
					web=linka.replace("www", "m");
				}else{
					web=linka.replace("www", "m");
				}
			}

			System.out.println(web);

		}

		web="abc";

		web+="http://www.royalchallengers.com/asdasda";

		if(web.indexOf("abc")!=-1)
		{
			System.out.println("web new b4 "+web);
			web=web.replace("abc","");
			System.out.println("web new  "+web);


		}





	}

}
