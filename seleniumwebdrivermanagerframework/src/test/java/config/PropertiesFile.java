package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Testng_demo;

public class PropertiesFile {

	static Properties prop =new Properties();
	static String projectpath=System.getProperty("user.dir");
	public static void main(String[] args) {
		getproperties ();
		setproperties();
		getproperties ();
	}
	
	
	public static void getproperties () 
	{


		try {
			Properties prop =new Properties();
			String projectpath=System.getProperty("user.dir"); 
			InputStream input =new FileInputStream(projectpath + "/src/test/java/config/config1.properties");
			prop.load(input);
			String browser= prop.getProperty("browser");
			System.out.println(browser);
			Testng_demo.browsername=prop.getProperty("browser");

		}

catch(Exception exp)
		{
		System.out.println("message is " + exp.getMessage());
		System.out.println("Cause is " + exp.getCause());
		exp.printStackTrace();


		}

		}
public static void setproperties () 
{
	try{


		OutputStream output =new FileOutputStream(projectpath + "/src/test/java/config/config1.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);

	} catch (Exception  exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
}

	
}
 