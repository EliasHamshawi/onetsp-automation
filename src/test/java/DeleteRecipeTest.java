import com.onetsp.automation.pageobjects.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeleteRecipeTest  extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.signIn();

        SigninPage signinPage = PageFactory.initElements(webDriver, SigninPage.class);
        signinPage.Signin("john.doe@gmail.com", "password123");

        ProfilePage profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        String fullName = profilePage.getFullName();

        Assert.assertEquals(fullName, "John Doe");

        RecipesPage recipesPage = PageFactory.initElements(webDriver, RecipesPage.class);
        recipesPage.selectRecipe("tbole");

        RecipePage recipePage = PageFactory.initElements(webDriver, RecipePage.class);
        recipePage.deleteRecipe(webDriver);
    }
}