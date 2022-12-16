package forgotPassword;

import base.BaseTests;
import pages.ForgotPasswordNextPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordsTest extends BaseTests {

    @org.testng.annotations.Test
    public void ForgotPassword (){
        ForgotPasswordPage forgotPage = homePage.clickForgotPassword();
        forgotPage.setEmailSpace("tau@example.com");
        ForgotPasswordNextPage forgotPasswordNextPage = forgotPage.clickButtonLogin();
        assertTrue(forgotPasswordNextPage.GetStatusAlert().contains
                        ("Internal Server Error"),("Incorrect message"));
    }
}
