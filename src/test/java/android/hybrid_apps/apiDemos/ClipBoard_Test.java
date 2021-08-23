package android.hybrid_apps.apiDemos;

import base.Supports;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pageObjectsModel.api_Demos_Pages.Clipboard;

import java.net.MalformedURLException;
import java.net.URL;

public class ClipBoard_Test {

    AndroidDriver<WebElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
        caps.setCapability(MobileCapabilityType.APP, Supports.APK_SYSTEM_PATH + Supports.SERENDROID);

        driver = new AndroidDriver<>(new URL(Supports.APPIUM_SERVER), caps);
    }

    @Test
    public void clipboard_Test() {
        Clipboard clipObj = new Clipboard(driver);
        clipObj.clipboardPage();
    }


}
