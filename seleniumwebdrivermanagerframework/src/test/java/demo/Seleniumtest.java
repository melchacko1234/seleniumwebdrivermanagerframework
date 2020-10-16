package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("automation step by step");
		//driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(5) div.ctr-p:nth-child(3) div.jhp.big:nth-child(3) form.tsf.nj:nth-child(4) div.A8SBwf:nth-child(1) div.RNNXgb:nth-child(2) div.SDkEP div.a4bIc > input.gLFyf.gsfi:nth-child(3)")).sendKeys("automation step by step");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		List <WebElement> webelements= driver.findElements(By.xpath("//input"));
		int count =webelements.size();
		
		System.out.println("count of webelemnts :" +count);
		//driver.quit();
		driver.close();
	}
}
