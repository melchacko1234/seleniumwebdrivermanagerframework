package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1_google_search {

	public static void main(String[] args) throws InterruptedException {
		googelsearch();

	}
public static void googelsearch() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
	Thread.sleep(4000);
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	driver.quit();
	
	
}
}
