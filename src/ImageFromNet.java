/*import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class ImageFromNet {
	

	public static void  main(String arg[])
	{
		try {
			HttpClient hc = new DefaultHttpClient();
            HttpGet get = new  HttpGet("http://photos-b.ak.fbcdn.net/hphotos-ak-ash4/432117_10150680637155619_153516655618_11558601_1295624190_s.jpg"); 
            System.out.println("here");
            HttpResponse res=hc.execute(get);
              if(res.getStatusLine().getStatusCode()== HttpStatus.SC_OK)
              {
            	  
            	  
            	  byte[] image = EntityUtils.toByteArray(res.getEntity()); 
            	 // String imagei = EntityUtils.toString(res.getEntity());
            	  System.out.println(image);
            	  
                  JSONObject obj = new JSONObject(result);
      				JSONArray array = obj.getJSONArray("interests");
      			for(int i = 0 ; i < array.length() ; i++)
      			{
      				System.out.println(array.getJSONObject(i).getString("interestKey"));
      			}
      			  
              }else
				System.out.println("not getting proper response");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			}
	}


}
*/