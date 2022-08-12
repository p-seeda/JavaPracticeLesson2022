package EnumConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) {
		Properties prop= null;
		try {
			FileInputStream ip = new FileInputStream("./JavaPractice/EnumConcept/config.properties");
			Properties prop1 = new Properties();
			prop1.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String brName = prop.getProperty("browser");
		//prop.getProperty("browser");
		System.out.println(brName);
	}

}
