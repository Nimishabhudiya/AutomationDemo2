package org.example;

import org.openqa.selenium.By;



import static org.example.Utils.utils.*;


public class HomePage extends Utils{
    private By register=By.className("ico-register");
    public void ClickOnRegister(){
        ClickOnElement(register);
    }
    public void getTextofRegister(){
        System.out.println(getTextFromElement(register));
    }


    }







