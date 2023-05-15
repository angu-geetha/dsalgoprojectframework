package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

	
	static Properties prop; 
	
	public static void loadProperty() {
	
		FileInputStream file;
		
		prop=new Properties(); 
		
		try {
			
		file = new FileInputStream("/Users/AKandan1/eclipse-workspace/dsalgoprojectframework/src/test/resources/Config/Config.properties");
		prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}
	
	public static String getProperty( String key) {
		return prop.getProperty(key);
	}
	
}
