package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumwait_demo {

	static WebDriver driver=null;
	public static void main(String[] args) {
		implicitexplicitwait();

	}
	
public static void implicitexplicitwait()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	//driver.findElement(By.name("ABCD")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element= wait.until(ExpectedConditions.elementToBeClickable((By.name("ABCD"))));
	driver.close();
	driver.quit();
	
	
	
	
}
}

