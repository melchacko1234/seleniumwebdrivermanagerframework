package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Step;

public class Google_searchpage_objectsTest {
	WebDriver driver=null;

	By textbox_search= By.name("q");
	By button_search= By.name("btnK");

	@Test
	public void Google_searchpage_objects(WebDriver driver) {

		this.driver=driver;
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void setbutton() {

		driver.findElement(button_search).sendKeys(Keys.RETURN);
		throw new RuntimeException("Test not implemented");
	}

	@Test
	@Step("Vefying textbox_search")
	public void settextbox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		throw new RuntimeException("Test not implemented");
	}
}
