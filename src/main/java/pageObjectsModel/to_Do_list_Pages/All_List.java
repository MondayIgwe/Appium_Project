package pageObjectsModel.to_Do_list_Pages;

import base.PageBase;
import base.Supports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class All_List extends PageBase {

    public All_List(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    // ======== Android & IOS Element Locators ====Page Factory==============
    @AndroidFindBy(accessibility = "Add Task")
    MobileElement addTask;

    @AndroidFindBy(id = "etQuickTask")
    AndroidElement quickTask;

    public All_List click_app() {
        click(addTask);
        Supports.thread_waitTime(2);
        return new All_List(this.getDriver());
    }

    public All_List enterQuickTaskHere(){
        sendText_(quickTask,"Budget");
        return new All_List(this.getDriver());
    }
}
