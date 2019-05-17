import com.onetsp.automation.pageobjects.HomePage;
import com.onetsp.automation.pageobjects.SignUpPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SignUpTest extends BaseTest {

    @Test
    public void test() {
        // go to home page
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.signUp();
        // fill sign up form
        SignUpPage signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);
        signUpPage.signUp("John Doe", "john.doe@gmail.com", "password123");
    }

}
