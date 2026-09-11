package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScreenShot1 {
	
	@Test
	public void DemoTest() throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		driver.manage().window().maximize();
		
		Reusability.capturedScreenShot(driver, "Launch Application -Screenshot");
		
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@name='action']")).click();

        Reusability.capturedScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");

        driver.quit();
	}
}
