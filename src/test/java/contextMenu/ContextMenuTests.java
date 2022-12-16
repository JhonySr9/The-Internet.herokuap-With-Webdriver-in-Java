package contextMenu;

import base.BaseTests;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @org.testng.annotations.Test
    public void ContextMenuAccept(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.leftClickContextBox();
        String message = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(message,"You selected a context menu", "Context menu not selected");
    }
}
