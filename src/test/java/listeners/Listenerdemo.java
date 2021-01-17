package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Listenerdemo {
	@Test
	public void test1()
	{
		System.out.println("This is Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is Test 2");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	}
	@Test
	public void test3()
	{
		System.out.println("This is Test 3");
		throw new SkipException("Test 3 is skipped");
	}
}
