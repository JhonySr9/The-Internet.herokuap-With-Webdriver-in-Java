package Slider;


import base.BaseTests;
import org.openqa.selenium.Keys;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTests {

    @org.testng.annotations.Test
    public void moveHorizontalTest() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.setSlider();
        horizontalSliderPage.moveSlider(Keys.ARROW_RIGHT);
        horizontalSliderPage.moveSlider(Keys.ARROW_RIGHT);
        horizontalSliderPage.moveSlider(Keys.ARROW_RIGHT);
        horizontalSliderPage.findRange();
        assertTrue(horizontalSliderPage.findRange().contains("4"),"Slider Value is incorrect.");
    }
}
