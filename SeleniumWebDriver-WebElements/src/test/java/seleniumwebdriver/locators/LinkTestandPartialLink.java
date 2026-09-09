package seleniumwebdriver.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTestandPartialLink {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		Thread.sleep(10000);
		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			
		}catch(Exception e) {
			System.out.println("Cookie popup not displayed");
		}
	}
	
	@Test
	public void findElementByLinkText() throws Exception{
		driver.findElement(By.partialLinkText("Vitamins")).click();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		System.out.println("Number of Links:"+ linkCount);
		
		for(int i=1;i<links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str=links.get(i).getText();
			String str1="Vitamins";
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("//*[@id=\"_root_\"]/div[3]/div[1]/div/a[4]")).click();
			}
		}
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
