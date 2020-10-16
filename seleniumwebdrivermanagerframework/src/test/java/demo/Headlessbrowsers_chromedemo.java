package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowsers_chromedemo {

	static WebDriver driver=null;
	public static void main(String[] args) {
		headlesschrome();

	}
	
	public static void headlesschrome()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("headless");
		option.addArguments("start-maximized");
		//option.addArguments("user-data-dir=/path/to/your/custom/profile");
		driver= new ChromeDriver(option);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Test complete");
	}

}
