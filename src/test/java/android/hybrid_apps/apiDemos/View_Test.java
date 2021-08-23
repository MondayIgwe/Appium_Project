package android.hybrid_apps.apiDemos;

import base.TestBase;
import org.testng.annotations.Test;
import pageObjectsModel.api_Demos_Pages.View;

public class View_Test extends TestBase {

    @Test
    public void viewTest() {
        View viewObj = new View(driver);
        viewObj.scroll_to_element("Views");
        viewObj.scroll_down(0.8, 0.1,0,0,3);
        viewObj.lists();
    }
}
