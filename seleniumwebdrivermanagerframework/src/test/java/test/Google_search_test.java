package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Google_search_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_search_test {

	public static void main(String[] args) throws InterruptedException {
		googelsearch();

	}
public static void googelsearch() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	Google_search_page.google_search_textbox(driver).sendKeys("automation step by step");
	
	Thread.sleep(4000);
	Google_search_page.google_search_textbox(driver).sendKeys(Keys.RETURN);
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	driver.close();
	System.out.println("Test completed succussfully");
	driver.quit();
	
	
}
}
