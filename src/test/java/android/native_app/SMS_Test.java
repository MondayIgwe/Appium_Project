package android.native_app;

import base.Supports;
import base.TestBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SMS_Test extends TestBase {


    @Test
    public void sms_() throws MalformedURLException {

        setAppPackage(Supports.MASSAGE_NATIVE_APP);
        setAppActivity(Supports.MASSAGE_NATIVE_ACTIVITY);

        DesiredCapabilities caps = new DesiredCapabilities();

        platform(Supports.ANDROID_NATIVE_APP);

        driver = new AndroidDriver(new URL(Supports.APPIUM_SERVER), caps);

       // driver.sendSMS("+27648533763", "Testing from appium automation");

    }
}
