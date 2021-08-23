package steps;

import base.Supports;
import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjectsModel.api_Demos_Pages.AppPage;

public class App_Steps extends TestBase {

    //Call the App Page
    AppPage appPage;

    @Before
    public void setUp(){
        platform(Supports.ANDROID_HYBRID_APP);
    }

    @Given("^Click App link$")
    public void clickAppLink() {

        appPage = new AppPage(driver);
        appPage.click_app();
    }

    @And("^Click Action bar$")
    public void clickActionBar() {

        appPage.action_bar();
    }

    @Then("^Click Action Bar Mechanics$")
    public void clickActionBarMechanics() {
        appPage.action_bar_mechanics();
    }


}
