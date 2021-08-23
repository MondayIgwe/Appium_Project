package android.hybrid_apps.apiDemos;

import base.Supports;
import base.TestBase;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjectsModel.api_Demos_Pages.AppPage;
import utils.JsonReader;

import java.io.IOException;

public class App_Test extends TestBase {

    // Call the Page
    AppPage appObj;

    @BeforeTest
    public void setUp() {

        platform(Supports.ANDROID_HYBRID_APP);
    }

    @Test(dataProvider = "someData")
    public void testNG_Test(String Json_Data, String Json_Attribute) {
        System.out.println(Json_Data +"/n"+ Json_Attribute);

    }

    @Test
    public void appTest() {
        appObj = new AppPage(driver);
        appObj.click_app()
                .action_bar()
                .action_bar_mechanics();
    }

    // TestNG Data Provider
    @DataProvider(name = "someData")
    public Object[][] passData(Object key) throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir") + "/src/main/resources/data/json/TaskData.json", "TaskData", 2);
    }
}