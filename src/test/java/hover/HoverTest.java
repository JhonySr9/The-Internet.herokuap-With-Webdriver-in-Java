package hover;

import base.BaseTests;

import static org.testng.Assert.*;

public class HoverTest extends BaseTests {

    @org.testng.annotations.Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1", "Caption not displayed");
        assertEquals(caption.getLinkText(),"View profile", "Caption not displayed");
        assertTrue(caption.getLink().endsWith("/users/1"),"Incorrect Message");
    }
}
