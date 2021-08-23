package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public AppiumDriver<MobileElement> driver;
    private String appPackage;
    private String appActivity;

    public void platform(String setPlatform) {
        DesiredCapabilities caps = new DesiredCapabilities();

        try {

            switch (setPlatform) {
                case Supports.ANDROID_NATIVE_APP:
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getAppPackage());
                    caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getAppActivity());
                    break;
                case Supports.ANDROID_HYBRID_APP:
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
                    caps.setCapability(MobileCapabilityType.APP, Supports.APK_SYSTEM_PATH + Supports.APIDEMOS);

                    break;
                case Supports.IOS:
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                    caps.setCapability(MobileCapabilityType.APP, Supports.APK_SYSTEM_PATH);
                    break;
                case Supports.WINDOW:
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "WinAppDriver");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "WINDOW");
                    caps.setCapability(MobileCapabilityType.APP, Supports.APK_SYSTEM_PATH);
                    break;
                case Supports.ANDROID_MOBILE_WEB:
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                    break;
                case Supports.IOS_MOBILE_WEB:
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XcuiTest");
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "anyName");
                    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Ios");
                    caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");

                    break;
                default:
                    System.out.println("UnSupported App SELECTION.....");

            }

            driver = new AndroidDriver(new URL(Supports.APPIUM_SERVER), caps);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());

        }

    }

    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public void tearDown() {
        try {
            if (null != driver) {
                driver.closeApp();
                driver.close();
                driver.quit();
            }

        } catch (WebDriverException ex) {
            System.out.println(ex.getAdditionalInformation());
        }

    }
}
