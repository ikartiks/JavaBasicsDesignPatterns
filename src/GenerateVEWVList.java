import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GenerateVEWVList {
	
	static final String className="VEWMemberPropsClobList";
	static final String viewObjClass="VEWMemberPropsClob";
	static final String viewObj="vEWMemberPropsClobList";
	
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
				"-- Purpose: It is collection of view object "+viewObjClass+".\n"+
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
		
		System.out.println("package ew.view;");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String imports="import java.util.ArrayList;\n"+
				"import java.util.List;\n"+
				"\n"+
				"import javax.xml.bind.annotation.XmlAccessType;\n"+
				"import javax.xml.bind.annotation.XmlAccessorType;\n"+
				"import javax.xml.bind.annotation.XmlRootElement;\n"+
				"\n"+
				"import org.codehaus.jackson.annotate.JsonAutoDetect;\n"+
				"import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;\n"+
				"import org.codehaus.jackson.map.annotate.JsonSerialize;\n"+
				"\n"+
				"import ew.db.view."+viewObjClass+";";
		
		System.out.println(imports);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String classStart="@JsonAutoDetect(getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)\n"+
				"@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL )\n"+
				"@XmlRootElement\n"+
				"@XmlAccessorType(XmlAccessType.FIELD)\n"+
				"public class "+className+" extends VList {";
		
		System.out.println(classStart);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("\t\tprivate static final long serialVersionUID = 1L;");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		String restOFTheClass="List<"+viewObjClass+"> "+viewObj+"=new ArrayList<"+viewObjClass+">();\n"+
				"\t\n"+
				"\tpublic "+className+"() {\n"+
				"\t\tsuper();\n"+
				"\t}\n"+
				"\n"+
				"\t@Override\n"+
				"\tpublic int getListSize() {\n"+
				"\t\treturn "+viewObj+".size();\n"+
				"\t}\n"+
				"\n"+
				"\t@Override\n"+
				"\tpublic List<?> getList() {\n"+
				"\t\treturn "+viewObj+";\n"+
				"\t}";
		
		System.out.println(restOFTheClass);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		String classEnd="}";
		
		System.out.println(classEnd);
	}

}
