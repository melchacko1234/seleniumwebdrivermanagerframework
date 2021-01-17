package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testng_demo2 {
	WebDriver driver;
	

	@BeforeTest
	public void setuptest()
	{	
		
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();


	}
	@Test
	public void google_search3() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	
	@AfterTest
	public void Teardown()
	{
		driver.close();
		driver.quit();
		System.out.print("Test completed Sucessfully");
	
	}



}




