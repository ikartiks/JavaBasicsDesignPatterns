import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;


public class GenerateEntityObj {

	static final String className="EWMemberPropsClob";
	static final String tableName="EW_MEMBER_PROPS_CLOB";
	
	static String currentDate;
	
	public static void main(String[] args) {
		
		Date today=new Date();
		SimpleDateFormat formatter;

		formatter = new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault());
		currentDate=formatter.format(today);
		
		String copyright="/* \n"+
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
				"-- Purpose: It is entity object for "+className+"  .\n"+
				"-- CRUD operation are performed using this object.\n"+
				"--\n"+
				"-- Author: Dharmesh Makwana\n"+
				"--\n"+
				"-- Change History\n"+
				"--\n"+
				"-- Modified by Date Notes\n"+
				" =========================================\n"+
				"-- Dharmesh Makwana "+currentDate+" Initial Version \n"+
				"--\n"+
				"**************************************************************************/";
		
		System.out.println(copyright);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String packageAndInfo="package ew.entity;\n"+
				"\n"+
				"import javax.persistence.Column;\n"+
				"import javax.persistence.Entity;\n"+
				"import javax.persistence.GeneratedValue;\n"+
				"import javax.persistence.GenerationType;\n"+
				"import javax.persistence.Id;\n"+
				"import javax.persistence.SequenceGenerator;\n"+
				"import javax.persistence.Table;\n"+
				"\n"+
				"import org.hibernate.annotations.Type;\n"+
				"\n"+
				"import ew.common.FSCommonEnums;";
		
		System.out.println(packageAndInfo);
		
		System.out.println("@Entity");
		System.out.println("@Table(name=\""+tableName+"\")");
		System.out.println("public class "+className+" extends EWDBBase {");

		
		
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
		
		//fieldsList.add(new Fields("String", "paramCode", false, "MEMBER_PROP_ID", false, tableName));
		
		//fieldsList.add(new Fields("String", "whereClause", false, "WHERE_CLAUSE", true, tableName));
		
		//fieldsList.add(new Fields("Boolean", "displayedFlag", false, "DISPLAYED_FLAG", false, tableName));
		
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
