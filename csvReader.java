package code;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class csvReader {
	
	static String s_id,s_name,s_emailid = "";
	
	public static void main(String[] args) throws Exception {
		// This will load csv file 
				CSVReader reader = new CSVReader(new FileReader("d:\\seleniu\\demo.csv"));

				// this will load content into list
				List<String[]> li=reader.readAll();
				 System.out.println("Total rows which we have is "+li.size());
				// create Iterator reference
				Iterator<String[]>i1= li.iterator();
				// Iterate all values 
				while(i1.hasNext()){
				//each row
					String[] str=i1.next();
					//System.out.print(" Values are ");
				//for each column seperated by commas	
				for(int i=0;i<str.length;i++)
				{
					 
					 // if i = 0 then it is id of emp
					 //if i = 1 then it is name of emp
					 //if i = 2 then it is email of emp
					 
					 
				      //System.out.print(" "+str[i]);
				      
				      switch (i) {
				      case 0:
				    	     s_id = str[i];
				    	     break;
				      case 1:
				    	  	 s_name = str[i];
				    	  	 break;
				      case 2:
				    	     s_emailid=str[i];
				    	     break;
				      }
				      
				}
				 
				 // here you can call a webdriver method to supply values as parameters from 
				//each row of the csv file
				
	    System.out.println("id:" + s_id + " name:"+ s_name + " Emailid:" + s_emailid);
				    
				    System.out.println("   ");
				}

	
			}

}
