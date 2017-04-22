import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class GenerateViewObj {
	
	static final String className="EWVReportOutputs";
	static final String tableName="EW_RPT_OUTPUTS_V";
	
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
				"-- Purpose: It is a view object derived from "+className+". \n"+
				"-- \n"+
				"--\n"+
				"-- Author: Dharmesh Makwana\n"+
				"--\n"+
				"-- Change History\n"+
				"--\n"+
				"-- Modified by Date Notes\n"+
				" =========================================\n"+
				"-- Dharmesh Makwana "+currentDate+" Initial Version \n"+
				"--\n"+
				" **************************************************************************/";
		
		System.out.println(copyright);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("package ew.db.view;");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String imports="import java.io.Serializable;\n"+
				"import java.util.ArrayList;\n"+
				"import java.util.Date;\n"+
				"import java.util.List;\n"+
				"\n"+
				"import javax.persistence.Column;\n"+
				"import javax.persistence.Entity;\n"+
				"import javax.persistence.Id;\n"+
				"import javax.persistence.Table;\n"+
				"import javax.persistence.Temporal;\n"+
				"import javax.persistence.TemporalType;\n"+
				"import javax.xml.bind.annotation.XmlRootElement;\n"+
				"\n"+
				"import ew.common.SearchField;\n"+
				"import ew.common.SortField;";
		
		System.out.println(imports);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("@Entity");
		System.out.println("@Table(name=\""+tableName+"\")");
		System.out.println("@XmlRootElement");
		System.out.println("public class "+className+" implements Serializable {");

		ArrayList<Fields> fieldsList=new ArrayList<Fields>();
		
		fieldsList.add(new Fields("Long", "reportOutputId", true, "RPT_OUTPUT_ID", false, tableName));
		fieldsList.add(new Fields("Long", "reportId", false, "RPT_ID", false, tableName));
		
		fieldsList.add(new Fields("String", "username", false, "USER_NAME", false, tableName));
		fieldsList.add(new Fields("String", "reportName", false, "RPT_NAME", false, tableName));
		fieldsList.add(new Fields("String", "status", false, "STATUS", false, tableName));
		fieldsList.add(new Fields("String", "paramList", false, "PARAM_LIST", true, tableName));
		fieldsList.add(new Fields("Blob", "reportOutput", false, "RPT_OUTPUT", false, tableName));
		fieldsList.add(new Fields("String", "fileName", false, "FILE_NAME", false, tableName));
		fieldsList.add(new Fields("String", "message", false, "MESSAGE", false, tableName));
		fieldsList.add(new Fields("String", "statusMeaning", false, "STATUS_MEANING", false, tableName));
		
		
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
		
		System.out.println("");
		
		String searchSortList="\tpublic static List<SortField> getSortList(){\n"+
				"\t\tList<SortField> sortList = new ArrayList<SortField>();\n"+
				"\t\treturn sortList;\n"+
				"\t}\n"+
				"\t\n"+
				"\tpublic static List<SearchField> getSearchFields(){\n"+
				"\t\tList<SearchField> searchFields = new ArrayList<SearchField>();\n"+
				"\t\treturn searchFields;\n"+
				"\t}";
		
		System.out.println(searchSortList);
		System.out.println("");
		System.out.println("}");
		

	}

}
