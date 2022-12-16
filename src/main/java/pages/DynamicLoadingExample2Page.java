package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startingButton = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By finishMessage = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startingButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
    }

    public String loadedText(){
        return driver.findElement(finishMessage).getText();
    }
}
