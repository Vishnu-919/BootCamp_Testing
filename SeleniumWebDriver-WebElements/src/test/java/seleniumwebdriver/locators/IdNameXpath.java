package seleniumwebdriver.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXpath {
	
	WebDriver driver;
	String baseURL="https://practicetestautomation.com/practice-test-login/";
	
	@Test
	public void IDLocator(){
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		//locators ID Name and Xpath
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		//How to copy Xpath  from Developer Tool
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	
}
