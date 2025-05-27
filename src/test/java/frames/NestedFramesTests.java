package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;
import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrameText(){
        NestedFramesPage nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Left Frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Bottom frame text incorrect");
    }
}
