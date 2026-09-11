package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FemaleRadioButton {

	@Test
	public void DemoTest(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male = driver.findElement(By.id("female"));
		male.click();
		System.out.println("Female selected:" +male.isSelected());
		
		boolean status = driver.findElement(By.id("female")).isSelected();
	    System.out.println(status);

	    boolean displayed = driver.findElement(By.id("female")).isDisplayed();
	    System.out.println(displayed);

	    boolean enabled = driver.findElement(By.id("female")).isEnabled();
	    System.out.println(enabled);

	     driver.quit();
	    }	
}
