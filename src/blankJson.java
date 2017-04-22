
public class blankJson {

	public blankJson() {
		// 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String json="{\"MatchesPlayed\":91,\"CareerRuns\":3938,\"Careeravg\":\"43.1778\",\"Fifties\":22,\"Centuries\":\"13\",\"TopRuns\":null,\"RunsVsTeam\":1438,\"CenturiesVsTeam\":1438,\"VsTeam\":\"Sri Lanka\"}";
		
		/*try {
			JSONObject jsonObj=new JSONObject(json);
			
			System.out.println(jsonObj.toString());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//String json=\"{\\"Ian Bell\\":\\"26\\",\\"Alastair Cook\\":\\"10\\",\\"Graeme Swann\\":\\"0\\",\\"James Anderson\\":\\"0\\",\\"Chris Woakes\\":\\"0\\",\\"Steven Finn\\":\\"0\\",\\"Craig Kieswetter\\":\\"0\\",\\"Jonathan Trott\\":\\"0\\",\\"Ravi Bopara\\":\\"0\\",\\"Eoin Morgan\\":\\"0\\",\\"Tim Bresnan\\":\\"0\\"}\";
		/*
		try {
			
			 
			 //no way to get json keys in their natural order
			 JSONObject j=new JSONObject(json);
			java.util.Iterator en=j.keys();
			
			
			
			
			JSONArray names=j.names();
			System.out.println(names.toString());
			
			for (int i = 0; i < names.length(); i++) {
				
				System.out.println(names.getJSONObject(i).toString());
				
			}
			
			while (en.hasNext()) {
				String type = (String) en.next();
				System.out.println(type);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		/*String b=\"[]\";
		try {
			JSONArray arr=new JSONArray(b);
			System.out.println(arr.toString());
			System.out.println(arr.length());
		} catch (JSONException e) {
			// 
			e.printStackTrace();
		}*/
		
		/*JSONArray arr=new JSONArray();
		
		JSONObject obj=new JSONObject();
		JSONObject objs=new JSONObject();
		try {
			obj.put(\"asd\", \"ads\");
			obj.put(\"asds\", \"adsssss\");
			objs.put(\"asds\", \"adsssss\");
			
			
			//System.out.println(obj.toString());
		} catch (JSONException e) {
			// 
			e.printStackTrace();
		}
		
		try {
			arr.put(1,obj);
			arr.put(2,objs);
		
		} catch (JSONException e) {
			// 
			e.printStackTrace();
		}
		
		
		//System.out.println(arr.toString());
		*/
		
		/*ArrayList<String> al=new ArrayList<String>();
		al.add(\"abc\");
		al.add(\"asddd\");
		al.add(\"ddd\");
		
		ArrayList<String> als=new ArrayList<String>();
		als.add(\"123\");
		als.add(\"sss\");
		als.add(\"ddd\");
		
		String x=\"{\";
		
		for(int i =0;i<al.size();i++)
		{
			if(i==al.size()-1)
			{
				x+=i+\":{ friend-id:\"+al.get(i)+\",friend-name:\"+\"\\"\"+als.get(i) +\"\\"}\";
			}else{
				x+=i+\":{ friend-id:\"+al.get(i)+\",friend-name:\"+\"\\"\"+als.get(i) +\"\\"},\" ;
			}
		}
		
		x+=\"}\";
		
		System.out.println(x);*/
		
		

	}

}
