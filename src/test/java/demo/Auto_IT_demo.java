package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_IT_demo {

	
	static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		auto_it_test1();

	}

	
	public static void auto_it_test1() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://filebin.net/");
		Thread.sleep(3000);
		driver.findElement(By.id("fileField")).click();
		Runtime.getRuntime().exec("E:/Selenium/Fileuploadscript_filebin.exe");
		
		Thread.sleep(4000);
	}
}
