import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class GenerateViewEntityObject {

	static final String className="VEWMemberPropsClob";
	static final String entityClassName="EWMemberPropsClob";
	static final String tableName="EW_MEMBER_PROPS_CLOB";
	
	static String currentDate;
	
	public static void main(String[] args) {
		
		Date today=new Date();
		SimpleDateFormat formatter;

		formatter = new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault());
		currentDate=formatter.format(today);
		
		String copyright="/*\n"+
				" * Copyright (c) 2015 EPMWare Inc.\n"+
				" * All rights reserved.\n"+
				" *\n"+
				" * This software is the confidential and proprietary information of\n"+
				" * EPMWare Inc. (\"Confidential Information\"). You shall not\n"+
				" * disclose such Confidential Information and shall use it only in\n"+
				" * accordance with the terms of the license agreement you entered into\n"+
				" * with EPMWare Inc.\n"+
				" */\n"+
				"\n"+
				"/**************************************************************************\n"+
				"--\n"+
				"-- Purpose: The data is mapped into this object which is requested from browser and \n"+
				"-- It is a view object which holds data related to entity object "+entityClassName+".\n"+
				"-- \n"+
				"--\n"+
				"-- Author: Dharmesh Makwana\n"+
				"--\n"+
				"-- Change History\n"+
				"--\n"+
				"-- Modified by Date Notes\n"+
				" =========================================\n"+
				"-- Dharmesh Makwana 26-Feb-2014 Initial Version \n"+
				"--\n"+
				"**************************************************************************/";
		
		System.out.println(copyright);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String packageAndInfo="package ew.view;\n"+
				"import ew.common.*;\n"+
				"\n"+
				"import javax.xml.bind.annotation.*;\n"+
				"\n"+
				"import org.codehaus.jackson.annotate.JsonAutoDetect;\n"+
				"import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;\n"+
				"import org.codehaus.jackson.annotate.JsonIgnoreProperties;\n"+
				"import org.codehaus.jackson.map.annotate.JsonSerialize;";
		
		System.out.println(packageAndInfo);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String xmlRootRelatedStuff="@JsonAutoDetect(getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)\n"+
				"@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL )\n"+
				"@JsonIgnoreProperties(ignoreUnknown=true)\n"+
				"@XmlRootElement";
		System.out.println(xmlRootRelatedStuff);
		System.out.println("public class "+className+" extends VEWDBBase implements java.io.Serializable {");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("\t/**\n\t * \n\t */\n\tprivate static final long serialVersionUID = 1L;");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		ArrayList<Fields> fieldsList=new ArrayList<Fields>();
		
		fieldsList.add(new Fields("Long", "memeberId", true, "MEMBER_ID", false, tableName));
		fieldsList.add(new Fields("Long", "propertyId", true, "PROP_ID", false, tableName));
		
		fieldsList.add(new Fields("Long", "appDimensionId", false, "APP_DIMENSION_ID", false, tableName));
		fieldsList.add(new Fields("Long", "memberPropertyId", false, "MEMBER_PROP_ID", false, tableName));
			
		fieldsList.add(new Fields("Clob", "propertyValue", false, "PROP_VALUE", true, tableName));
		
		
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			System.out.println("");
			System.out.println(fields.printData());
		}
		
		System.out.println("");
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			System.out.println(fields.printGetterNSetters());
		}
		
		System.out.println();
		System.out.println();
		
		printToStringStart();
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			fields.printToStringField();
		}
		printToStringEnd();
		
		printEqualsStart();
		for (Iterator iterator = fieldsList.iterator(); iterator.hasNext();) {
			Fields fields = (Fields) iterator.next();
			fields.printEqualsField();
		}
		printEqualsEnd();
		
		System.out.println();
		System.out.println("}");
	}
	
	public static  void printToStringStart(){
		
		System.out.println("\t \t @Override");
		System.out.println("\t \t public String toString() {");
		System.out.println("\t \t \t String str = \""+className+"={\";");
	}
	
	public static void printToStringEnd(){
		
		System.out.println("\t \t \t str += \"}\";");
		System.out.println("\t \t \t return str;");
		System.out.println(" \t \t }");
	}
	
	public static  void printEqualsStart(){
		
		System.out.println("\t \t @Override");
		System.out.println("\t \t 	public boolean equals(Object obj) {");
		System.out.println("\t \t \t \t\tif ( !super.equals(obj) ) {\r\n\t\t\treturn false;\r\n\t\t}");
		System.out.println(className+" other = ("+className+") obj;");
	}
	
	public static void printEqualsEnd(){
		System.out.println("\t \t \t return true;");
		System.out.println(" \t \t }");
	}
	
	

}



//	
//	@Override
//	public int getMyClassType() {
//		return FSCommonEnums.CLASS_TYPE_EW_IF_CONFIG;
//	}
//	
//}
