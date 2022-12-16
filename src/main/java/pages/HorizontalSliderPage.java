package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.xpath("/html/body/div[2]/div/div/div/input");
    private By number = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSlider(){
        driver.findElement(slider).click();
    }

    public void moveSlider(Keys arrow){
        driver.findElement(slider).sendKeys(arrow);
    }

    public String findRange(){
        return driver.findElement(number).getText();
    }
}
