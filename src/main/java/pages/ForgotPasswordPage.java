package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By EmailSpace = By.id("email");
    private By EmailSubmit = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailSpace(String Email) {
        driver.findElement(EmailSpace).sendKeys(Email);
    }

    public ForgotPasswordNextPage clickButtonLogin() {
        driver.findElement(EmailSubmit).click();
        return new ForgotPasswordNextPage(driver);
    }
}
