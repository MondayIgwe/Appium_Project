package android.native_app;

import base.Supports;
import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Photo_Test extends TestBase {

    File classpath, imageDir, img;

    private static final By photoBtn = By.id("com.google.android.apps.photos:id/recycler_view");


    @BeforeTest
    public void setUp() {
        setAppPackage(Supports.PHOTO_NATIVE_APP);
        setAppActivity(Supports.PHOTO_NATIVE_ACTIVITY);

        DesiredCapabilities caps = new DesiredCapabilities();

        platform(Supports.ANDROID_NATIVE_APP);
    }

    @Test
    public void photo_() throws IOException {


        classpath = new File(System.getProperty("user.dir"));
        imageDir = new File(classpath, "src/main/resources/images");
        img = new File(imageDir.getCanonicalFile(), "demoImage.png");


        String android_photo_path = "mnt/SDCARD/Android";

       // WebDriverWait wait = new WebDriverWait(base.getDriver(), 10);

        //base.getDriver().pushFile(android_photo_path + "/" + img.getName(), img);

    }
}
