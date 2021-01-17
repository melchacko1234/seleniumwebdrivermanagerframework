package demo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserStack_demo {
	public static final String USERNAME = "melchackoabraham1";
	  public static final String AUTOMATE_KEY = "i6U4Yq3zJ9DyNxvTGeHN";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "latest");
	    caps.setCapability("project", "Google test");
	    caps.setCapability("build", "build 1.1");
	    caps.setCapability("name", "Google_search");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("browserstack.selenium_version", "3.14.0");

	    
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
	}


