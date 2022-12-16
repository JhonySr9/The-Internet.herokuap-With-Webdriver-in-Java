package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By triggerAlertButton = By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
    private By confirmAlertButton = By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    private By PromptAlertButton = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
    private By resultAlert = By.id("result");



    public AlertsPage (WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(confirmAlertButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(PromptAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String alertResult(){
        return driver.findElement(resultAlert).getText();
    }
}
