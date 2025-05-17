package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE", "Key press result is wrong");
    }

    @Test
    public void testSpecialCharacters(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText(Keys.chord(Keys.SHIFT,"8","5","4"));
    }
}
