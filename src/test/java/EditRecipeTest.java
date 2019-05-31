import com.onetsp.automation.pageobjects.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class EditRecipeTest extends BaseTest {

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
        recipesPage.selectRecipe("knafe");

        RecipePage recipePage = PageFactory.initElements(webDriver, RecipePage.class);
        recipePage.editRecipe("hh", "hhh");
    }
}
