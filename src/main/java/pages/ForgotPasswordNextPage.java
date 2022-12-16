package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordNextPage {

    private WebDriver driver;
    private By StatusAlert = By.xpath("/html/body/h1");

    public ForgotPasswordNextPage (WebDriver driver){
        this.driver = driver;
    }

    public String GetStatusAlert(){
        return driver.findElement(StatusAlert).getText();
    }
}
