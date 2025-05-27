package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.RightClickOnBox();
        String text = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(text,"You selected a context menu","Context Menu text incorrect");
    }
}
