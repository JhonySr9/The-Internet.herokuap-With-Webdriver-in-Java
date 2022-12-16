package alerts;

import base.BaseTests;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @org.testng.annotations.Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/jhony/IdeaProjects/webdriver_java/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadFiles(),"chromedriver.exe","Incorrect Message");
    }
}
