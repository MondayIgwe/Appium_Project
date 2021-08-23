package pageObjectsModel.api_Demos_Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class Clipboard {

    AndroidDriver<WebElement> driver;

    public Clipboard(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    public void clipboardPage() {

        String text = "Hello";

        driver.setClipboardText(text);

        MobileElement nameTxt = (MobileElement) driver.findElementByAccessibilityId("my_text_fieldCD");
        nameTxt.clear();
        nameTxt.sendKeys(driver.getClipboardText());


    }

}
