package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "src\\Resources\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]")).click();



    }
}