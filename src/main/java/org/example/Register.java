package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;
public class Register extends Utils {

    private By yourpersonaldetails = By.className("title");
    private By gender=By.id("gender-female");
    private By FirstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList=By.xpath("//select[@name='DateOfBirthMonth']");
    private By yearDropList=By.xpath("//select[@name='DateOfBirthYear']");
    private By Email=By.id("Email");
    private By CompanyName=By.xpath("//input[@name='Company']");
    private By Password=By.id("Password");
    private By ConfirmPassword=By.xpath("//input[@name='ConfirmPassword']");

    public void personalDetails() {
        System.out.println(getTextFromElement(yourpersonaldetails));
        ClickOnElement(gender);
        enterText(FirstName, "Nimisha");
        enterText(LastName, "Pindoria");
        SelectByVisibleText(dayDropList, "17");
        SelectByVisibleText(monthDropList, "January");
        SelectByVisibleText(yearDropList, "1996");
        enterText(Email,"Nimishabhudiya@gmail.com");
        enterText(CompanyName,"Eurocom");
        enterText(Password,"nimisha123");
        enterText(ConfirmPassword,"nimisha123");





    }

    }




