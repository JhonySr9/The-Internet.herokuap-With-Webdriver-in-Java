package loading;

import base.BaseTests;

import static org.testng.Assert.assertEquals;


public class LoadedTextTest extends BaseTests {

    @org.testng.annotations.Test
    public void LoadedTextTest (){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.loadedText(),"Hello World!", "Loaded incorrectly");
    }

    @org.testng.annotations.Test
    public void LoadedTextTest2 (){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.loadedText(), "Hello World!", "Loaded incorrectly");
    }

}
