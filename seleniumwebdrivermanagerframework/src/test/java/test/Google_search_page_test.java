package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Google_searchpage_objects;

public class Google_search_page_test {

	public static void main(String[] args) throws InterruptedException {
		googlesearchtest();

	}
	
	public static void googlesearchtest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		Google_searchpage_objects searchobj= new Google_searchpage_objects(driver);
		
		driver.get("https://www.google.com/");
		searchobj.settextbox("Automation step by step");
		Thread.sleep(3000);
		searchobj.setbutton();
		driver.close();
		
	}

}
