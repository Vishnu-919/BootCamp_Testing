package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.Pages.LoginEasyCal;

import Helper.BrowserFactory;

public class ExecuteLoginPage {

@Test
public void LoginPage() {

    WebDriver driver = BrowserFactory.startBrowser(
            "Chrome",
            "https://www.login.hiox.com/login?referrer=easycalculation.com"
    );
    LoginEasyCal loginPageEasyCal =
            PageFactory.initElements(driver, LoginEasyCal.class);
    loginPageEasyCal.login_EasyCal(
            "d5H4ku@XJFk65C6",
            "vishnuvardan919@gmail.com"
    );
    BrowserFactory.closeBrowser(driver);
}


}
