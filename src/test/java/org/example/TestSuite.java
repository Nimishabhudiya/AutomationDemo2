package org.example;

import org.junit.Test;

import java.util.concurrent.Callable;


public class TestSuite extends BrowserSetup{

        HomePage homePage=new HomePage();
        Register registerPage=new Register();

        @Test
        public void OpenHomepage(){
            homePage.ClickOnRegister();
            homePage.getTextofRegister();
            registerPage.personalDetails();


                }
            }







