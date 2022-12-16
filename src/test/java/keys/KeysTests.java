package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @org.testng.annotations.Test
    public void testBackspace(){
        var keyPage = homePage.clickKey();
        keyPage.enterTest("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE!");
    }

    @org.testng.annotations.Test
    public void testLittleA(){
        var keyPage = homePage.clickKey();
        keyPage.enterPi();
    }
}
