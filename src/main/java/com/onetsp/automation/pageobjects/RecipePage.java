package com.onetsp.automation.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class RecipePage {

    @FindBy(xpath = "//div/ul[@class='recipe-list']/li/a/div[@class='recipe-name']")
    List<WebElement> recipes;

    @FindBy(id = "editRecipe")
    WebElement editrecipe;

    @FindBy(id = "deleteRecipe")
    WebElement deleterecipe;

    public void deleteRecipe(WebDriver webDriver) {
        deleterecipe.click();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }

    public void editRecipe(String title, String description) {
        editrecipe.sendKeys();
        editrecipe.click();
    }

}







