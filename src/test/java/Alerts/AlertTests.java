package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlter(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(),"You successfully clicked an alert","Result text incorrect");
    }

    @Test
    public void testGetTextFromAlter(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerPrompt();
        String text = "alert input test";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(),"You entered: " + text,"Result text incorrect");
    }
}
