package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonDemo {
	
	@Test
	public void TestRadio() throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//label[@for='male']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='female']")).click();
		Thread.sleep(10000);
		
		
	}

}
