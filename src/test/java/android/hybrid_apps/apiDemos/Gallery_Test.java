package android.hybrid_apps.apiDemos;

import base.TestBase;
import org.testng.annotations.Test;
import pageObjectsModel.api_Demos_Pages.Gallery;

public class Gallery_Test extends TestBase {

    Gallery gallery;

    @Test
    public void drag_DropTest() {
        gallery = new Gallery(driver);

//        gallery.scroll_to_element("Views");
//        gallery.swipe_left("Gallery");

    }
}