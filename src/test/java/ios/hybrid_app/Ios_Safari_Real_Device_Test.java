package ios.hybrid_app;

import base.Supports;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Ios_Safari_Real_Device_Test {

    IOSDriver<WebElement> driver;

    @Test
    public void run_real_device() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(IOSMobileCapabilityType.PLATFORM_NAME, "14.3");
        caps.setCapability("platformVersion", "IOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("deviceName", "iPhone 11 Pro");
        caps.setCapability("xcodeOrId", "groovymondee@gmail.com");
        caps.setCapability("xcodeSigningId", "iPhone Developer");
        caps.setCapability("udid", "1245653232322-356987456321E");
        caps.setCapability("useNewWDAr",true);
        caps.setCapability("safari:useSimulator",true);
        caps.setCapability("derivedDataPath","/Users/ig/Library/Developer/Xcode/DerivedData/WebDriverAgent-acvsdgfhutiyoymnpoiwedass");

        driver = new IOSDriver<>(new URL(Supports.APPIUM_SERVER), caps);
    }


    @AfterMethod
    public void tearDown() {

    }
}
