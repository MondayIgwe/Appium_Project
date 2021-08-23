package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;


//Page Factory Model Design Pattern - Getters and Setters (Encapsulation)

public class PageBase {

    AppiumDriver<MobileElement> driver;
    public static final long WAIT = 10;


    public PageBase(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }


    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    /*
        This methods below are events that with happen in the Pages
     */


    public void waitForVisibility(MobileElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception webDriverError) {

            System.out.println(webDriverError.getMessage());
        }
    }

    public void click(MobileElement element) {
        try {
            waitForVisibility(element);
            element.click();
        } catch (Exception webDriverError) {

            System.out.println(webDriverError.getMessage());
        }
    }

    public void clearTextField(MobileElement element) {
        try {
            waitForVisibility(element);
            element.clear();
        } catch (Exception webDriverError) {

            System.out.println(webDriverError.getMessage());
        }
    }

    public void sendText_(MobileElement element, String text) {
        try {
            waitForVisibility(element);
            element.sendKeys(text);
        } catch (Exception webDriverError) {

            System.out.println(webDriverError.getMessage());
        }
    }

    public String getAttribute(MobileElement element, String attribute) {
        try {
            waitForVisibility(element);
            return element.getAttribute(attribute);
        } catch (Exception webDriverException) {
            System.out.println(webDriverException.getMessage());
        }

        return null;
    }

    public void getContexts(String context_views) {
        Set<String> contexts = driver.getContextHandles();

        for (String context : contexts) {
            System.out.println("Context: " + context);

            if (context.contains(context_views)) {
                driver.context(context);
                break;
            }
        }
    }

    public String getText(MobileElement element, String text) {
        try {
            waitForVisibility(element);
            return element.getText();
        } catch (Exception webDriverException) {
            System.out.println(webDriverException.getMessage());
        }
        return null;
    }
}