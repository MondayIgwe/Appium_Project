package android.hybrid_apps.seredroid;

import base.Supports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Serendroid_App_Test {

    private AppiumDriver<WebElement> driver;

    // Page Object Model Element Locators
    private static By chromeBtn = MobileBy.AccessibilityId("buttonStartWebviewCD");
    private static By goBackBtn = By.id("io.selendroid.testapp:id/goBack");


    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Supports.PLATFORM_NAME);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Supports.AUTOMATION_NAME);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, Supports.DEVICE_NAME);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, Supports.AUTO_GRANT_PERMISSION);
        caps.setCapability(MobileCapabilityType.APP, Supports.APK_SYSTEM_PATH + "selendroid-test-app-0.17.0.apk");


        driver = new AndroidDriver<>(new URL(Supports.APPIUM_SERVER),caps);
    }

    @Test
    public void run_seredroid(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(chromeBtn)).click();

        switchToWebView();

        WebElement name = driver.findElement(By.id("name_input"));
        name.clear();
        name.sendKeys("James");
        driver.context("NATIVE_APP");
        driver.findElement(goBackBtn).click();

    }


    public void switchToWebView(){
        Set<String> contexts  = driver.getContextHandles();

        for (String context : contexts){
            System.out.println("Context: " + context);

            if(context.contains("WEBVIEW")){
                driver.context(context);
                break;
            }
        }
    }
}
