package navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
	
	WebDriver driver;
	String URL;
	
    @Test(priority=1)
	public void NavigateBackDemo() throws Exception{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String Title =driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://erp.cbit.org.in/");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(5000);
		
		driver.navigate().back();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
	}
    
    @Test(priority=0)
  	public void NavigateForwardDemo() throws Exception{
  		driver = new ChromeDriver();
  		driver.get("https://www.google.com/");
  		String URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		String Title =driver.getTitle();
  		System.out.println(Title);
  		
  		driver.navigate().to("https://www.zomato.com/");
  		URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		Thread.sleep(5000);
  		
  		driver.navigate().forward();
  		URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		
    }
    
    @Test(priority=2)
  	public void NavigateRefreshDemo() throws Exception{
  		driver = new ChromeDriver();
  		driver.get("https://www.google.com/");
  		String URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		Thread.sleep(5000);
  		driver.navigate().refresh();
  		
  		String Title =driver.getTitle();
  		System.out.println(Title);
  		
  		driver.navigate().to("https://www.zomato.com/");
  		URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		Thread.sleep(5000);
  		
  		driver.navigate().refresh();
  		URL=driver.getCurrentUrl();
  		System.out.println(URL);
  		
    }
	

}
