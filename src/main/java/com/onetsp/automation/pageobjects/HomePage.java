package com.onetsp.automation.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign up now")
    WebElement signUpNowButton;

    @FindBy(linkText = "Sign-in")
    WebElement signInLink;

    public void signUp() {
        signUpNowButton.click();
    }

    public void signIn() {
        signInLink.click();
    }
}
