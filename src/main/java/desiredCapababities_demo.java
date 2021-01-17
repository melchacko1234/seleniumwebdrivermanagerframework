import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class desiredCapababities_demo {

	public static void main(String[] args) {
		
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setCapability("enableElementCacheCleanup", true);
		caps.setCapability("ignoreZoomSetting", true);
		WebDriverManager.iedriver().setup();
	    
		WebDriver driver= new InternetExplorerDriver(caps);
	    driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();

	
	}

}
