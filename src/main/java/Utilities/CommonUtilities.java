package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static Utilities.Constants.USER_DIR;
import static Utilities.Constants.APPLICATION_PROPERTIES;
public class CommonUtilities {

	public String getApplicationproperty(String Key) throws IOException {
		Properties properties = new Properties();
		String filePath = USER_DIR+File.separator+APPLICATION_PROPERTIES;
		FileInputStream inputfile = new FileInputStream(filePath);
		String value = "";
		try {
			properties.load(inputfile);
			value = properties.getProperty(Key);
			System.out.println("value we got" +value);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			inputfile.close();
		}
		
		
		return value;
		
	}
}
