package android.web_app;

import base.Supports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Mobile_Web_Test {


    @Test
    public void mobile_web() throws MalformedURLException {
        AppiumDriver driver;

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        driver = new AppiumDriver(new URL(Supports.APPIUM_SERVER), caps);

        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);


        driver.findElementByCssSelector("input#username").sendKeys("tomsmith");

        driver.findElementByCssSelector("input#password").sendKeys("SuperSecretPassword!");

        driver.findElementByCssSelector("button.radius").click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains("secure"));
        System.out.println(driver.getCurrentUrl());


    }
}
