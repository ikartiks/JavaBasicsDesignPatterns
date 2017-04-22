import java.util.ArrayList;
import java.util.Iterator;


public class WriteMappingCode {
	
	static final String className="EWReportParamsDetails";
	static final String tableName="EW_RPT_PARAM_DETAILS";

	public static void main(String[] args) {
		
		ArrayList<Fields> fieldsList=new ArrayList<Fields>();
		
		
		fieldsList.add(new Fields("Long", "memeberId", true, "MEMBER_ID", false, tableName));
		fieldsList.add(new Fields("Long", "propertyId", true, "PROP_ID", false, tableName));
		
		fieldsList.add(new Fields("Long", "appDimensionId", false, "APP_DIMENSION_ID", false, tableName));
		fieldsList.add(new Fields("Long", "memberPropertyId", false, "MEMBER_PROP_ID", false, tableName));
			
		fieldsList.add(new Fields("Clob", "propertyValue", false, "PROP_VALUE", true, tableName));
		
		
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			fields.mapEntityToViewBean();
		}
		
		System.out.println();
		System.out.println();
		
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			fields.mapViewToEntityBean();
		}
	}

}
