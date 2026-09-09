package locatorsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyCalculationCountDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/ul/li[7]/a")).click();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		

	}

}
