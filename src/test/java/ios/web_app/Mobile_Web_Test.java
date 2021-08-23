package ios.web_app;

import base.Supports;
import base.helper_encaps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
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
        AppiumDriver<WebElement> driver;
        helper_encaps encaps = new helper_encaps();

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "iOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        caps.setCapability("safari:useSimulator",true);

        driver = new AppiumDriver<>(new URL(Supports.APPIUM_SERVER), caps);

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
