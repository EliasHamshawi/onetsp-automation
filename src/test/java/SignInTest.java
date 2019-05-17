import com.onetsp.automation.pageobjects.HomePage;
import com.onetsp.automation.pageobjects.ProfilePage;
import com.onetsp.automation.pageobjects.SigninPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
public class SignInTest extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.signIn();

        SigninPage signinPage = PageFactory.initElements(webDriver, SigninPage.class);
        signinPage.Signin("john.doe@gmail.com", "password123");

        ProfilePage profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        String fullName = profilePage.getFullName();

        Assert.assertEquals(fullName, "John Doe");
    }

}
