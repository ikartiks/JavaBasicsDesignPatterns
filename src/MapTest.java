import java.util.HashMap;


public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("asd", "ddd");
		map.put(null, null);
		map.put(null, "d");
		System.out.println(map.keySet());
	}

}
