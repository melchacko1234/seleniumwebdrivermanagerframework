package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Google_search_page {
	
	private static WebElement element =null;

	

	public static WebElement google_search_textbox(WebDriver driver)
	{
		
	element=driver.findElement(By.xpath("//input[@name='q']"));
	return element;
		
	}
	
	public static WebElement google_search_button(WebDriver driver)
	{
		
	element=driver.findElement(By.name("btnK"));
	return element;
	}
}

