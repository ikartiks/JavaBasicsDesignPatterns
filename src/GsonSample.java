import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class GsonSample {

	public static void main(String[] args) {
		
		String x="{\"acc_details\":{\"Country_Std_Code\":\"91\",\"Pin\":\"400092\",\"Phone\":\"1234567890\",\"Age\":\"45 \",\"State_Name\":\"Daman and Diu\",\"Country_Name\":\"INDIA\",\"Password\":\"DxO1OtcfPxU=\",\"Last_Name\":\"hzzgs\",\"Country_Code\":\"IND\",\"State_Code\":\"DMD\",\"City\":\"zbzhzh\",\"id\":\"9F99E241-DBD4-E211-9054-000C29762494\",\"Email\":\"asd@asd.com\",\"Gender\":\"1\",\"First_Name\":\"gjzhxb\"},\"trip_details\":[{\"TravelDateTime\":\"2013-08-22 15:12:36.000\",\"source\":\"Road No 19\",\"tripId\":\"1325\",\"vehicleType\":\"Horse Carriage\",\"vehicleNo\":\"FFF\",\"destination\":\"\"},{\"TravelDateTime\":\"2013-08-22 15:36:15.000\",\"source\":\"Krantiveer Lakhuji Salve Marg\",\"tripId\":\"1329\",\"vehicleType\":\"Bus\",\"vehicleNo\":\"AAA \",\"destination\":\"fff \"},{\"TravelDateTime\":\"2013-11-07 15:27:17.000\",\"source\":\"dcdf\",\"tripId\":\"1538\",\"vehicleType\":\"Horse Carriage\",\"vehicleNo\":\"FJVG\",\"destination\":\"wgbj\"},{\"TravelDateTime\":\"2013-11-07 19:04:38.000\",\"source\":\"ryvfyh\",\"tripId\":\"1541\",\"vehicleType\":\"Car\",\"vehicleNo\":\"THCF\",\"destination\":\"ssvj cgbf\"},{\"TravelDateTime\":\"2013-11-07 19:21:07.000\",\"source\":\"fuvv\",\"tripId\":\"1542\",\"vehicleType\":\"Truck\",\"vehicleNo\":\"FYB CV\",\"destination\":\"dygcf\"},{\"TravelDateTime\":\"2013-11-08 12:56:43.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1544\",\"vehicleType\":\"1\",\"vehicleNo\":\"\",\"destination\":\"powai\"},{\"TravelDateTime\":\"2013-11-08 12:56:43.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1545\",\"vehicleType\":\"1\",\"vehicleNo\":\"\",\"destination\":\"powai\"},{\"TravelDateTime\":\"2013-11-08 15:30:21.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1548\",\"vehicleType\":\"Car\",\"vehicleNo\":\"BDGH\",\"destination\":\"gbgfvvh\"},{\"TravelDateTime\":\"2013-11-08 15:42:58.000\",\"source\":\"fxc xzhbc\",\"tripId\":\"1549\",\"vehicleType\":\"Car\",\"vehicleNo\":\"DHV\",\"destination\":\"chb s\"},{\"TravelDateTime\":\"2013-11-08 16:13:05.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1550\",\"vehicleType\":\"Car\",\"vehicleNo\":\"gVVGG\",\"destination\":\"rjvcg\"},{\"TravelDateTime\":\"2013-11-11 11:59:40.000\",\"source\":\"4\",\"tripId\":\"1552\",\"vehicleType\":\"Horse Carriage\",\"vehicleNo\":\"YCGB\",\"destination\":\"cgvvv\"},{\"TravelDateTime\":\"2013-11-11 12:04:00.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1553\",\"vehicleType\":\"Car\",\"vehicleNo\":\"VHBV\",\"destination\":\"ftgcc\"},{\"TravelDateTime\":\"2013-11-11 12:07:05.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1554\",\"vehicleType\":\"Car\",\"vehicleNo\":\"TGF\",\"destination\":\"fhvf\"},{\"TravelDateTime\":\"2013-11-11 12:12:59.000\",\"source\":\"4\",\"tripId\":\"1556\",\"vehicleType\":\"Car\",\"vehicleNo\":\"SDGCD\",\"destination\":\"fyhcrtf\"},{\"TravelDateTime\":\"2013-11-18 11:51:08.000\",\"source\":\"Seepz Road B\",\"tripId\":\"1611\",\"vehicleType\":\"Cab/Taxi\",\"vehicleNo\":\"FVCGC\",\"destination\":\"crgc\"}],\"incident_details\":[{\"TravelDateTime\":\"\",\"tripId\":\"589\",\"IncidentDetails\":\"hdxbxg\",\"ReportedDateTime\":\"2013-06-20 16:23:01.957\",\"IncidentName\":\"Injury/Assault\"},{\"TravelDateTime\":\"\",\"tripId\":\"619\",\"IncidentDetails\":\"detailks1\",\"ReportedDateTime\":\"2013-06-21 15:30:22.417\",\"IncidentName\":\"Missing\"}],\"contacts\":[]}";
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		
		//gson.fromJson(x, String.class);
		JsonObject obj = (JsonObject)parser.parse(x);
        JsonElement acc_details = obj.get("acc_details");
        JsonElement trips = obj.get("trip_details");
        JsonArray array=obj.getAsJsonArray("trip_details");
        //System.out.println(id); // Prints "10001"
        
        Type listType = new TypeToken<ArrayList<TripDetails>>(){}.getType();
		AccountDetails person = gson.fromJson(acc_details, AccountDetails.class);
		person.tripDetails=gson.fromJson(array, listType);
		
		/*for (int i = 0; i < person.tripDetails.size(); i++) {
			System.out.println(person.tripDetails.get(i));
		}
		*/
		System.out.println(person);
		
		
	}
	
	class AccountDetails{
		
		String id;
		String First_Name;
		ArrayList<TripDetails> tripDetails;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFirst_Name() {
			return First_Name;
		}
		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}
		
		@Override
		public String toString() {
			return "id is "+this.id+" name "+this.First_Name ;
		}
	}
	
	
	class TripDetails{
		
		String tripId;
		String source;
		String destination;
		String vehicleNo;
		
		
		public String getTripId() {
			return tripId;
		}
		public void setTripId(String tripId) {
			this.tripId = tripId;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getVehicleNo() {
			return vehicleNo;
		}
		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}
		
		@Override
		public String toString() {
			return "id is "+this.tripId+" name "+this.source ;
		}
		
	}
}
