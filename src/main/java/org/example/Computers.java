package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.Utils.utils.ClickOnElement;
import static org.example.Utils.utils.getTextFromElement;


public class Computers {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "src\\Resources\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li")).click();



    }
}