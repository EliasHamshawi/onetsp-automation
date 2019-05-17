package com.onetsp.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class SigninPage {

        @FindBy(name = "email")
        WebElement email;

        @FindBy(name="password")
        WebElement password;

        @FindBy(css="input[type='submit']")
        WebElement Signinbuttoun;

        public void Signin(String emailInput,String passwordInput) {
            email.sendKeys(emailInput);
            password.sendKeys(passwordInput);
            Signinbuttoun.click();
        }

    }

