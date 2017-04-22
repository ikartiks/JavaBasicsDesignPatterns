import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;


public class ReadCSVFile {

	public static void main(String[] args) {
		
		CSVReader reader;
		try {
			
			 reader = new CSVReader(new FileReader("/Users/kartikshah/Desktop/words.csv"));
			 String [] nextLine;int count=0;
		     while ((nextLine = reader.readNext()) != null) {
		     	count++;
		     	if(count<400)
		     		continue;
		     	
		     	if(count==500)
		     		break;
		    	 //insertWord(341,8, "Elude","escape from or avoid something", "evade" ,"The criminal was able to elude the police in the crowded mall");
		    	 	
//		    	 System.out.println("insertWord("+nextLine[0]+","+nextLine[1]+", \""+nextLine[2]+"\",\""+nextLine[3]+"\","
//		    	 		+ " \""+nextLine[4]+"\", \""+nextLine[5]+"\");");
		    	 

//		    	 System.out.println("contentValues=new ContentValues();");
//		    	 System.out.println("contentValues.put(GroupsTable.groupDescription,\""+nextLine[2]+"\");");
//		    	 System.out.println("contentValues.put(GroupsTable.groupIsHighFreq,"+nextLine[3]+");");
//		    	 System.out.println("contentValues.put(GroupsTable.groupId,"+nextLine[0]+");");
//		    	 System.out.println("contentValues.put(GroupsTable.groupName,\""+nextLine[1]+"\");");
//		    	 //System.out.println("contentValues.put(GroupsTable.groupProgress,"+"aSD"+");");
//		    	 System.out.println("contentResolver.insert(GREVocabContentProvider.GROUPS.allGroups,contentValues);");
//		    	 System.out.println();
		    	 
		    	 System.out.println("contentValues =new ContentValues();");
		    	 System.out.println("contentValues.put(WordsTable.wordComment,\""+""+"\");");
		    	 System.out.println("contentValues.put(WordsTable.wordIsStarred,0);");
		    	 System.out.println("contentValues.put(WordsTable.wordUnderstoodCount,-1);");
		    	 
		    	 System.out.println("contentValues.put(WordsTable.wordMeaning,\""+nextLine[3]+"\");");
		    	 System.out.println("contentValues.put(WordsTable.wordName,\""+nextLine[2]+"\");");
		    	 
		    	 String x=nextLine[4];
		    	 if(x.equals("NULL"))
		    		 x="";
		    	 System.out.println("contentValues.put(WordsTable.wordSimilarMeaning,\""+x+"\");");
		    	 System.out.println("contentValues.put(WordsTable.wordSentance,\""+nextLine[5]+"\");");
		    	 System.out.println("contentValues.put(WordsTable.wordsGroupId,"+nextLine[1]+");");
		    	 System.out.println("contentValues.put(WordsTable.wordsid,"+nextLine[0]+");");
		    	 System.out.println("contentResolver.insert(GREVocabContentProvider.Words.allWords,contentValues);");
		    	 System.out.println("");
		    	 
		  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

}
