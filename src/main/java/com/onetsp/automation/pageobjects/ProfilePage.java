package com.onetsp.automation.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    @FindBy(xpath = "//div[@id='head']/div[@class='primary']/ul/li[7]")
    WebElement fullName;

    @FindBy(xpath = "//div[@id='head']/div[@class='primary']/ul/li[1]")
    WebElement addrecipe;

    @FindBy(xpath = "//div[@id='head']/div[@class='primary']/ul/li[2]")
    WebElement recipes;

    public String getFullName() {
        return fullName.getText().trim();

    }

    public void addRecipe() {
        addrecipe.click();
    }

    public void listRecipes() {
        recipes.click();
    }

}
