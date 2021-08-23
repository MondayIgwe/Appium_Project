package pageObjectsModel.api_Demos_Pages;

import base.PageBase;
import base.Supports;
import base.CommonLibs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Drag_Drop extends PageBase {

    AndroidTouchAction actions;

    public Drag_Drop(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


//    @Override
//    public void scroll_to_element(String view) {
//        AndroidElement views = (AndroidElement) driver.findElementByAccessibilityId(view);
//        actions = new AndroidTouchAction(driver);
//        actions.tap(ElementOption.element(views)).perform();
//        Supports.thread_waitTime(2);
//
//    }
//
//    @Override
//    public void swipe_left(String ele) {
//
//    }
//
//
//    @Override
//    public void drag_drop(String dragDrop) {
//        AndroidElement drag_drop_ = (AndroidElement) driver.findElementByAccessibilityId(dragDrop);
//        actions.tap(ElementOption.element(drag_drop_)).perform();
//
//        Supports.thread_waitTime(1);
//
//        AndroidElement drag_source = (AndroidElement) driver.findElement(By.id("drag_dot_1"));
//        AndroidElement drop_destination = (AndroidElement) driver.findElement(By.id("drag_dot_2"));
//
//        actions.longPress(ElementOption.element(drag_source))
//                .waitAction().moveTo(ElementOption.element(drop_destination))
//                .release()
//                .perform();
//
//
//    }
//
//    @Override
//    public void scroll_down(double height, double weight, int pressXOffSet, int moveToXOffSet, int duration) {
//        Dimension dimension = driver.manage().window().getSize();
//        int scrollStart = (int) (dimension.getHeight() * height);
//        int scrollend = (int) (dimension.getWidth() * weight);
//
//        actions = new AndroidTouchAction(driver)
//                .press(PointOption.point(pressXOffSet, scrollStart))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
//                .moveTo(PointOption.point(moveToXOffSet, scrollend))
//                .release()
//                .perform();
//    }
}
