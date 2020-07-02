package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup extends BasePage{
    @Before
    public void OpenBrowser(){
    System.setProperty("webdriver.chrome.driver","src\\Resources\\BrowserDriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    }
    @After
    public void CloseBrowser(){
     //driver.close();
    }

}
