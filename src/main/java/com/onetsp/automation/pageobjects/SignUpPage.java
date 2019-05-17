package com.onetsp.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(name = "display_name")
    WebElement name;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement signUpButton;

    public void signUp(String nameInput, String emailInput, String passwordInput) {
        name.sendKeys(nameInput);
        email.sendKeys(emailInput);
        password.sendKeys(passwordInput);
        signUpButton.click();
    }

}
