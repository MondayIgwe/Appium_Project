package pageObjectsModel.api_Demos_Pages;

import base.PageBase;
import base.Supports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.NoSuchElementException;
import java.util.Objects;


//The Page will extend the PageBase class
public class AppPage extends PageBase {


    public AppPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }

    // ======== Android & IOS Element Locators ====Page Factory==============
    @AndroidFindBy(accessibility = "App")
    MobileElement applnk;
    @iOSXCUITFindBy(accessibility = "App")
    MobileElement applnk_ios;
    @AndroidFindBy(id = "android:id/text1")
    MobileElement actionBar;
    @AndroidFindBy(id = "android:id/text1")
    MobileElement actionBarMechanics;


    public AppPage click_app() {
        click(applnk);
        Supports.thread_waitTime(2);
        return new AppPage(this.getDriver());
    }

    public AppPage action_bar() {
        if (Objects.equals(actionBar.getText(), "Action Bar"))
            click(actionBar);

        return new AppPage(this.getDriver());
    }

    public void action_bar_mechanics() {
        try {

            if (Objects.equals(actionBarMechanics.getText(), "Action Bar Mechanics"))
                click(actionBarMechanics);
            Supports.thread_waitTime(2);

        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
