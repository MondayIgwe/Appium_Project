package pageObjectsModel.api_Demos_Pages;

import base.Supports;
import base.CommonLibs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import java.time.Duration;

public class View extends CommonLibs {

    AppiumDriver driver;
    AndroidTouchAction actions;


    public View(AppiumDriver driver) {
        this.driver = driver;
    }

    public void lists() {
        AndroidElement lists = (AndroidElement) driver.findElementByAccessibilityId("Lists");
        actions.tap(ElementOption.element(lists)).perform();
    }

    @Override
    public void scroll_to_element(String view) {
        AndroidElement views = (AndroidElement) driver.findElementByAccessibilityId(view);
        actions = new AndroidTouchAction(driver);
        actions.tap(ElementOption.element(views)).perform();
        Supports.thread_waitTime(2);
    }

    @Override
    public void swipe_left(String ele) {

    }

    @Override
    public void drag_drop(String ele) {

    }

    @Override
    public void scroll_down(double height, double weight,int pressXOffSet,int moveToXOffSet, int duration) {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * height);
        int scrollend = (int) (dimension.getWidth() * weight);

        actions = new AndroidTouchAction(driver)
                .press(PointOption.point(pressXOffSet, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(moveToXOffSet, scrollend))
                .release()
                .perform();
    }
}
