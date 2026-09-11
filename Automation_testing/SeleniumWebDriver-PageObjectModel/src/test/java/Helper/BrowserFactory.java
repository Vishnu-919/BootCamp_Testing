package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

public static WebDriver startBrowser(String browser, String url) {
    WebDriver driver = null;
    if (browser.equalsIgnoreCase("Chrome")
            || browser.equalsIgnoreCase("GC")
            || browser.equalsIgnoreCase("Google Chrome")) {

        driver = new ChromeDriver();

    } else if (browser.equalsIgnoreCase("Edge")
            || browser.equalsIgnoreCase("EG")
            || browser.equalsIgnoreCase("Microsoft Edge")) {

        driver = new EdgeDriver();

    } else if (browser.equalsIgnoreCase("Firefox")
            || browser.equalsIgnoreCase("FF")
            || browser.equalsIgnoreCase("Mozilla Firefox")) {

        driver = new FirefoxDriver();

    } else {

        System.out.println("Sorry we do not support this browser");
        return null;
    }

    driver.manage().window().maximize();

    // Open URL
    driver.get(url);

    return driver;
}

public static void closeBrowser(WebDriver driver) {

    if (driver != null) {
        driver.quit();
    }
}


}
