package alerts;

import base.BaseTests;

import static org.testng.Assert.assertEquals;


public class AlertTests extends BaseTests {

    @org.testng.annotations.Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.alertResult(),"You successfully clicked an alert", "Result not found");
    }

    @org.testng.annotations.Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "You haven't clicked correctly");
    }

    @org.testng.annotations.Test
    public void testGetPromptFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "uwu";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.alertResult(), "You entered: " + text, "Incorrect result.");
    }
}
