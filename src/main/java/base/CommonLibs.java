package base;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonLibs {

    public abstract void scroll_to_element(String obj);

    public abstract void swipe_left(String ele);

    public abstract void drag_drop(String ele);

    public abstract void scroll_down(double height, double weight, int pressXOffSet, int moveToXOffSet, int duration);

    public boolean set_WebDriverWait_urlContains(AppiumDriver<WebElement> driver, String urlContains){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.urlContains(urlContains));
    }
}