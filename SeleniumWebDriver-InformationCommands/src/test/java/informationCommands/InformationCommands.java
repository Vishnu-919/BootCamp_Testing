package informationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InformationCommands {

    WebDriver driver = new ChromeDriver();
    @Test(priority = 3)
    public void verifyBrowserInformation() {
        driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Movie Tickets, Plays, Sports, Events & Cinemas near Hyderabad - BookMyShow Hyderabad.")) {
            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://in.bookmyshow.com/explore/home/hyderabad")) {
            System.out.println("URL verified");
        } else {
            System.out.println("URL not verified");
        }
    }
    
    WebDriver driver1 = new FirefoxDriver();
    @Test(priority = 1)
    public void verifyBrowserInformation1() {
    	driver1.get("https://www.qualcomm.com/");
        String title = driver1.getTitle();
        System.out.println(title);
        if (title.equals("Qualcomm:Intelligent Computing Everywhere")) {
            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }
        String url = driver1.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.qualcomm.com/")) {
            System.out.println("URL verified");
        } else {
            System.out.println("URL not verified");
        }
    }
    
    WebDriver driver2 = new EdgeDriver();
    @Test(priority = 2)
    public void verifyBrowserInformation2() {
        driver2.get("https://erp.cbit.org.in/");
        String title = driver2.getTitle();
        System.out.println(title);
        if (title.equals("Bees Erp Login")) {
            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }
        String url = driver2.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://erp.cbit.org.in/")) {
            System.out.println("URL verified");
        } else {
            System.out.println("URL not verified");
        }
    }
    
    WebDriver driver4 = new ChromeDriver();
    @Test(priority = 0)
    public void verifyBrowserInformation4() {
        driver4.get("https://www.toyotabharat.com/");
        String title = driver4.getTitle();
        System.out.println(title);
        if (title.equals("Toyota India | Official Website")) {
            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }
        String url = driver4.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.toyotabharat.com/")) {
            System.out.println("URL verified");
        } else {
            System.out.println("URL not verified");
        }
    }
    
    
}