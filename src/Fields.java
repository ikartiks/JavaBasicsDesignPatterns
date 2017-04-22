
public class Fields {
	
	//protected Long id;
	String datatype;
	String variableName;
	String variableNameForMethods;
	boolean isPrimary;
	String columnName;
	boolean isNullable;
	String tableName;
	
	
	public Fields(String datatype,String variableName,boolean isPrimary,String columnName,boolean isNullable,String tableName) {
		
		this.datatype=datatype;
		this.variableName=variableName;
		this.isPrimary=isPrimary;
		this.columnName=columnName;
		this.isNullable=isNullable;
		this.tableName=tableName;
		
		char[] charArr=variableName.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < charArr.length; i++) {
			if(i==0)
				sb.append(Character.toUpperCase(charArr[0]));
			else 
				sb.append(charArr[i]);
		}
		variableNameForMethods=sb.toString();
	}
	

	
	public String printData() {
		
		String toReturn="";
		
		String primaryComment="";
		String defaultPrimaryFields="";
		String booleanToAppend="";
		String dateToAppend="";
		if(isPrimary){
			
			primaryComment="\t * <ul>\n"+
					"\t * <li>This attribute is the <b>Primary Key</b> for this class<br>.\n"+
					"\t * </ul>\n";
			defaultPrimaryFields="\n\t@Id\n"+
					"\t@GeneratedValue(strategy=GenerationType.AUTO, generator = \"G1\")\n"+
					"\t@SequenceGenerator(name = \"G1\", sequenceName = \""+tableName+"_S1\")\n";
		}
		if(datatype.equals("Boolean"))
			booleanToAppend="\t@Type(type=\"yes_no\")\n";
		
		if(datatype.equals("Date"))
			dateToAppend="\t@Temporal(TemporalType.TIMESTAMP)\n";
		
		String columnMappedToComment="\t/**\n"+
				"\t * Column mapped to \""+columnName+"\"\n"+
				primaryComment+
				"\t *\n"+
				"\t */";
		
		toReturn+=columnMappedToComment;
		defaultPrimaryFields+="\n\t@Column(name=\""+columnName+"\",nullable="+isNullable+")\n";
		toReturn+=defaultPrimaryFields;
		toReturn+=booleanToAppend;
		toReturn+=dateToAppend;
		if(datatype.equals("Blob")||datatype.equals("Clob")){
			
			toReturn+="\t@Lob\n";
			datatype="String";
		}
		toReturn+="\tprotected "+datatype+" "+ variableName+";";
		
		return toReturn;
	}
	
	public String printGetterNSetters() {
		String toReturn="";
		toReturn+="\n";
		toReturn+="\n";
		
		toReturn+="\t/**\n"+
				"\t * @return gets "+columnName+" attribute of member\n"+
				"\t */\n"+
				"\tpublic "+datatype+" get"+variableNameForMethods+"() {\n"+
				"\t\treturn "+variableName+";\n"+
				"\t}\n"+
				"\n"+
				"\t/**\n"+
				"\t * @param "+variableName+" sets "+datatype+" attribute of member\n"+
				"\t */\n"+
				"\tpublic void set"+variableNameForMethods+"("+datatype+" "+variableName+") {\n"+
				"\t\tthis."+variableName+" = "+variableName+";\n"+
				"\t}";
		
		return toReturn;
	}
	
	public void mapEntityToViewBean() {
		System.out.println("viewBean.set"+variableNameForMethods+"("+"t.get"+variableNameForMethods+"());");
	}
	
	public void mapViewToEntityBean() {
		System.out.println("t.set"+variableNameForMethods+"("+"viewBean.get"+variableNameForMethods+"());");
	}
	
	
//	@Override
//	public int getMyClassType() {
//		
//		return FSConstants.CLASS_TYPE_MESSAGE;
//	}
	
//	@Override
//	public String toString() {
//		String str = "EWIFLines={";
//		str += super.toString();
//		str += "id={" + id + "} ";
//		str += "name={" + name + "} ";
//		str += "movedToParentMember={" + movedToParentMember + "} ";
//		str += "prevSiblingMember={" + prevSiblingMember + "} ";
//		str += "memberName={" + memberName + "} ";
//		str += "movedToParentMember={" + movedToParentMember + "} ";
//		str += "parentMemberName={" + parentMemberName + "} ";
//		str += "actionCode={" + actionCode + "} ";
//		str += "movedToParentMember={" + movedToParentMember + "} ";
//		str += "dimensionName={" + dimensionName + "} ";
//		str += "appName={" + appName + "} ";
//		str += "lineNo={" + lineNo + "} ";
//		str += "ud1={" + ud1 + "} ";
//		str += "ud2={" + ud2 + "} ";
//		str += "ud3={" + ud3 + "} ";
//		str += "workflowName={" + workflowName + "} ";
//		str += "priority={" + priority + "} ";
//		str += "description={" + description + "} ";
//		str += "dueDate={" + dueDate + "} ";
//		str += "requestDate={" + requestDate + "} ";
//		str += "requesterUserName={" + requesterUserName + "} ";
//		str += "refrenceNo={" + refrenceNo + "} ";
//		str += "status={" + status + "} ";
//		str += "}";
//		return str;
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if ( !super.equals(obj) ) {
//			return false;
//		}
//		EWIFLines other = (EWIFLines) obj;
//		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//    		return false;
//		}
//		if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
//    		return false;
//		}
//		if ((this.refrenceNo == null && other.refrenceNo != null) || (this.refrenceNo != null && !this.refrenceNo.equals(other.refrenceNo))) {
//    		return false;
//		}
//		if ((this.requesterUserName == null && other.requesterUserName != null) || (this.requesterUserName != null && !this.requesterUserName.equals(other.requesterUserName))) {
//	    		return false;
//		}
//		if ((this.requestDate == null && other.requestDate != null) || (this.requestDate != null && !this.requestDate.equals(other.requestDate))) {
//	    		return false;
//		}
//		if ((this.dueDate == null && other.dueDate != null) || (this.dueDate != null && !this.dueDate.equals(other.dueDate))) {
//	    		return false;
//		}
//		if ((this.priority == null && other.priority != null) || (this.priority != null && !this.priority.equals(other.priority))) {
//	    		return false;
//		}
//		if ((this.workflowName == null && other.workflowName != null) || (this.workflowName != null && !this.workflowName.equals(other.workflowName))) {
//	    		return false;
//		}
//		if ((this.ud3 == null && other.ud3 != null) || (this.ud3 != null && !this.ud3.equals(other.ud3))) {
//    		return false;
//		}
//		if ((this.ud2 == null && other.ud2 != null) || (this.ud2 != null && !this.ud2.equals(other.ud2))) {
//	    		return false;
//		}
//		if ((this.ud1 == null && other.ud1 != null) || (this.ud1 != null && !this.ud1.equals(other.ud1))) {
//	    		return false;
//		}
//		if ((this.lineNo == null && other.lineNo != null) || (this.lineNo != null && !this.lineNo.equals(other.lineNo))) {
//	    		return false;
//		}
//		if ((this.appName == null && other.appName != null) || (this.appName != null && !this.appName.equals(other.appName))) {
//	    		return false;
//		}
//		if ((this.dimensionName == null && other.dimensionName != null) || (this.dimensionName != null && !this.dimensionName.equals(other.dimensionName))) {
//	    		return false;
//		}
//		if ((this.memberName == null && other.memberName != null) || (this.memberName != null && !this.memberName.equals(other.memberName))) {
//    		return false;
//		}
//		if ((this.prevSiblingMember == null && other.prevSiblingMember != null) || (this.prevSiblingMember != null && !this.prevSiblingMember.equals(other.prevSiblingMember))) {
//	    		return false;
//		}
//		if ((this.movedToParentMember == null && other.movedToParentMember != null) || (this.movedToParentMember != null && !this.movedToParentMember.equals(other.movedToParentMember))) {
//    		return false;
//		}
//		
//		if( this.status != other.status ) return false;
//		
//		return true;
//	}
	
	public void printToStringField(){
		
		System.out.println("\t \t \t str += \""+this.variableName+"={\" + "+this.variableName+" + \"} \";");
	}
	
	public void printEqualsField(){
		
		if(this.datatype.equals("Boolean")){
			
			System.out.println("\t \t \t if( this."+this.variableName+" != other."+this.variableName+" ) return false;");
		}else{
			System.out.println("\t \t \t if ((this."+this.variableName+" == null && other."+this.variableName+" != null) || (this."+this.variableName+" != null && !this."+this.variableName+".equals(other."+this.variableName+"))) {");
			System.out.println("\t \t \t \t return false;");
			System.out.println("\t \t \t }");
		}
		
	}
	
	
}
