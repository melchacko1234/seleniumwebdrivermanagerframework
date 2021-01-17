package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReportsBasicDemo {

	


	public static void main(String[] args) throws InterruptedException {
		//System.out.println("Hi");

		ExtentreportgoogleSearch();
	}		



	private static void ExtentreportgoogleSearch() throws InterruptedException {

		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extent.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google search Test one ", "To check the gooogle search functionality");

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		test1.log(Status.INFO, "Starting the test case");

		driver.get("https://www.google.com/");
		test1.pass("Navigated to  google.com");



		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered the text in google search text");
		Thread.sleep(4000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("google search button clicked");


		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		test1.info("Test completed");

		ExtentTest test2 = extent.createTest("Google search Test Two ", "To check the google search functionality");

		WebDriverManager.chromedriver().setup();
		WebDriver driver1= new ChromeDriver();
				test2.log(Status.INFO, "Starting the test case");

		driver1.get("https://www.google.com/");
		test2.pass("Navigated to  google.com");



		driver1.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered the text in google search text");
		Thread.sleep(4000);
		driver1.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("google search button clicked");


		driver1.close();
		driver1.quit();
		test2.fail("Close the browser");
		test2.info("Test completed");


		extent.flush();



	}

}
