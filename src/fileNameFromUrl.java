
public class fileNameFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String url="http://www.castrolcricket.com/images/team_flags/eng_80x50.jpg";
		int lastIndexOfSlash=url.lastIndexOf("/");
		System.out.println(lastIndexOfSlash);
		String fileName=url.substring(lastIndexOfSlash+1, url.length());
		System.out.println(fileName);

	}

}
