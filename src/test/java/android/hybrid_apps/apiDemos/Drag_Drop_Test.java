package android.hybrid_apps.apiDemos;

import base.TestBase;
import org.testng.annotations.Test;
import pageObjectsModel.api_Demos_Pages.Drag_Drop;

public class Drag_Drop_Test extends TestBase {

    @Test
    public void drag_DropTest() {
        Drag_Drop drag_dropObj = new Drag_Drop(driver);
//
//        drag_dropObj.scroll_to_element("Views");
//        drag_dropObj.drag_drop("Drag and Drop");
    }
}