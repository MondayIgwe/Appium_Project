package android.hybrid_apps.to_dolist_tests;

import base.Supports;
import base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectsModel.to_Do_list_Pages.All_List;

public class All_List_Test extends TestBase {

    //Call the PAGE
    All_List to_do_list;

    @BeforeTest
    public void setUp() {
        platform(Supports.ANDROID_NATIVE_APP);
    }

    @Test
    public void to_do() {

        to_do_list = new All_List(driver);

        setAppPackage("com.splendapps.splendo");
        setAppActivity("com.splendapps.splendo.MainActivity");

        to_do_list.enterQuickTaskHere()
                .click_app();


    }
}
