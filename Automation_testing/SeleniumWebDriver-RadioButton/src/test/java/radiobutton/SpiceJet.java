package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {

	@Test
	public void TestRadio() throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][normalize-space()='Senior Citizen']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][normalize-space()='Unaccompanied Minor']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Students')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][normalize-space()='Armed Forces']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][normalize-space()='Govt. Employee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Special Assistance')]")).click();
		
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
		
	}

}
