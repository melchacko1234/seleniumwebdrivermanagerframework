package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports_Testng {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;	
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		htmlReporter= new ExtentHtmlReporter("extenttestng.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		
		ExtentTest test1 = extent.createTest("Google search Test one ", "To check the gooogle search functionality");
        test1.log(Status.INFO, "Starting the test case");

		driver.get("https://www.google.com/");
		test1.pass("Navigated to  google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered the text in google search text");
		Thread.sleep(4000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("google search button clicked");
		test1.pass("Close the browser");
		test1.info("Test completed");
	}
	
	@AfterTest
	public void teardowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");
	}

	@AfterSuite
	public void teardown()
	{
		
		extent.flush();
		
	}
	


	
}
