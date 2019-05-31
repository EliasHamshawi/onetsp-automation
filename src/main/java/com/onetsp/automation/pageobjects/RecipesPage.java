package com.onetsp.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class RecipesPage {


    @FindBy(xpath = "//div/ul[@class='recipe-list']/li/a/div[@class='recipe-name']")
    List<WebElement> recipes;

    public List<String> getRecipes() {
        List<String> recipesList = new ArrayList<String>();
        for (WebElement recipeElement : recipes) {
            recipesList.add(recipeElement.getText());
        }
        return recipesList;
    }

    public void selectRecipe(String recipeName) {
        for (WebElement recipeElement : recipes) {
            if (recipeElement.getText().equalsIgnoreCase(recipeName)) {
                recipeElement.click();
                break;
            }
        }
    }


}

