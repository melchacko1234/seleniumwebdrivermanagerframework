package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Multi_browser {

	WebDriver driver=null;
	@Parameters("Browsername")
	@BeforeTest
	public void setuptest(String Browsername)
	{
		System.out.println("The browser name is :"  +Browsername);
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (Browsername.equalsIgnoreCase("Edge"))

		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if (Browsername.equalsIgnoreCase("Firefox"))

		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

	}

	@Test
	public void Test1() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	@AfterTest
	public void teardown()
	{

		//driver.close();
		driver.quit();
	}
}

