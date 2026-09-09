package webDriverCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BrowserCommands {
	
	@Test(priority=0)
	public void ChromeBrowserTest() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	@Test(priority=1)
	public void FirefoxBrowserTest() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cbit.ac.in/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	
	}
	
	@Test(priority=2)
	public void EdgeBrowserTest() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	@Test(priority=3)
	public void FirefoxBrowserTest3() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	
	}
	
	@Test(priority=4)
	public void FirefoxBrowserTest4() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.thehindu.com/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	
	}
	
	@Test(priority=5)
	public void ChromeBrowserTest5() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://my.shaadi.com/payment?source=lifecycle-bigday_stop_page&st=y&ref=https://www.google.com/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	@Test(priority=6)
	public void ChromeBrowserTest6() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/software-testing/software-testing-basics/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	@Test(priority=7)
	public void ChromeBrowserTest7() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.iitm.ac.in/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	@Test(priority=8)
	public void ChromeBrowserTest8() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mit.edu/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
	
	
	
	@Test(priority=9)
	public void EdgeBrowserTest9() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://tourism.telangana.gov.in/");
		driver.manage().window().maximize();
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		String BrowserURL= driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
	}
}
