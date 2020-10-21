package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucelabs {
	public static final String USERNAME = "melchacko1234";
	  public static final String AUTOMATE_KEY = "ccce1daa-e942-4f87-8ee6-d1cd9bcb18cd";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	    caps.setCapability("name", "Google_Browser_Test");
	    caps.setCapability("extendedDebugging", "true");
	    caps.setCapability("build", "3.1");
	    
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    //WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	   

	    System.out.println(driver.getTitle());
	    driver.quit();
	  }

}
