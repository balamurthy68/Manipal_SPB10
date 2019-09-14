package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("c:\\Users\\Lenovo\\eclipse-workspace\\PageObjectModel\\src\\newtours.properties");
		obj.load(objfile);
		String s_un = obj.getProperty("un");
        String s_pw = obj.getProperty("pw");
		
        System.out.println(s_un);
        
        
        System.out.println(s_pw );
        
	}

}
