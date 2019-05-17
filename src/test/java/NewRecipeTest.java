import com.onetsp.automation.pageobjects.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class NewRecipeTest extends BaseTest {

    @Test
    public void test() {

        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.signIn();

        SigninPage signinPage = PageFactory.initElements(webDriver, SigninPage.class);
        signinPage.Signin("john.doe@gmail.com", "password123");

        ProfilePage profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        String fullName = profilePage.getFullName();

        Assert.assertEquals(fullName, "John Doe");

        profilePage.addRecipe();

        NewRecipePage newRecipePage = PageFactory.initElements(webDriver ,NewRecipePage.class);
        newRecipePage.Newrecipe("Chocolate Cake","Tasty cake");

        profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        profilePage.listRecipes();

        RecipesPage recipesPage = PageFactory.initElements(webDriver, RecipesPage.class);
        List<String> recipes = recipesPage.getRecipes();

        Assert.assertTrue(recipes.contains("tbole"));

    }
}