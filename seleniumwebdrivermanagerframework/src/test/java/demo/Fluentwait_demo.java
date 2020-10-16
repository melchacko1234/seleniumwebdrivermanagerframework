package demo;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait_demo {
	
	static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
		fluentwaittest();

	}
	
	public static void fluentwaittest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		//driver.findElement(By.linkText("2")).click();
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 WebElement xpathelement= driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/a/h3/span"));
			    	 if(xpathelement.isEnabled())
			    	 {
			    		 System.out.println("Element found");
			    	 }
					return xpathelement;
			     }
			   });
			   
			   element.click();
			   Thread.sleep(2000);
			     
			   
	
	    //driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/a/h3/span")).click();
		//driver.findElement(By.linkText("Automation - Selenium WebDriver tutorial Step by Step")).click();
		
		driver.close();
		driver.quit();
	}

}
