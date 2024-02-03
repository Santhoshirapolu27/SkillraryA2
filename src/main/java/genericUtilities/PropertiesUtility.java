package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * This class contains reusable methods to initialize and read data from properties file
 * @author Dell New
 */
public class PropertiesUtility {
	private Properties property;
	
	/**
	 * This method is used to initialize properties file
	 * @param filePath
	 */
	
	public void propertiesInit(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * This method fetches data from properties file based on the key passed as an argument
	 * @param Key
	 * @return
	 */
	public String readFromProperties(String Key) {
		return property.getProperty(Key);
	}
}
