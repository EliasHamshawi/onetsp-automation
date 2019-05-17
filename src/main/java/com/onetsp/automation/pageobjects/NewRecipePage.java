package com.onetsp.automation.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRecipePage {

    @FindBy(name = "title")
    WebElement title;

    @FindBy(name = "description")
    WebElement description;

    @FindBy(xpath = "//button[contains(text(),'Save Recipe')]")
    WebElement Saverecipebuttoun;

public void Newrecipe(String titleInput,String descriptionInput){

    title.sendKeys(titleInput);
    description.sendKeys(descriptionInput);
    Saverecipebuttoun.click();
}


}
