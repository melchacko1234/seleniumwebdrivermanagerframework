package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import config.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import listeners.AllureListener;
import pages.Google_searchpage_objects;
import pages.Google_searchpage_objectsTest;


@Listeners({AllureListener.class})

public class Google_search_testTest  extends BaseClass{

  
  @Test(priority = 1, description = "verifying googlesearch test")
  @Severity(SeverityLevel.CRITICAL)
  @Description("Testcase description: Verfiy login credentinals of googlesearch")
  public void googelsearchtest1()throws InterruptedException
  {
	 // public static void googlesearchtest() throws InterruptedException
		
	  BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
			
			Google_searchpage_objects searchobj= new Google_searchpage_objects(driver);
			
			driver.get("https://www.google.com/");
			searchobj.settextbox("Automation step by step");
			Thread.sleep(3000);
			searchobj.setbutton();
			driver.close();
			
		

	
    //throw new RuntimeException("Test not implemented");
  }
}
