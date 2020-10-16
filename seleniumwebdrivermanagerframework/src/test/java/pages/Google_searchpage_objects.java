package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_searchpage_objects {

	WebDriver driver=null;
	
	By textbox_search= By.name("q");
	By button_search= By.name("btnK");
	
	public Google_searchpage_objects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void settextbox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void setbutton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
