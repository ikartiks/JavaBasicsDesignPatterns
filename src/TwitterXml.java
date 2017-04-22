/*import java.io.ByteArrayInputStream;
import java.net.URLDecoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class TwitterXml {
	
	public static void  main(String arg[])
	{
		try {
			HttpClient hc = new DefaultHttpClient();
            HttpGet get = new  HttpGet("http://www.royalchallengers.com/mobile-app/services/rcb-tweet-get-rss.php"); 
            
            HttpResponse res=hc.execute(get);
              if(res.getStatusLine().getStatusCode()== HttpStatus.SC_OK)
              {
            	  
            	  String result = EntityUtils.toString(res.getEntity()); 
            	  DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            	  DocumentBuilder build=dbf.newDocumentBuilder();
            	  Document doc=build.parse(new InputSource(new ByteArrayInputStream(result.getBytes("utf-8"))));
            	  Element e=doc.getDocumentElement();
            	  System.out.println(e.getNodeName());
              }else
				System.out.println("not getting proper response");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			}
	}

}
*/