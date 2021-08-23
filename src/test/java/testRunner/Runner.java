package testRunner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/resources/features",
glue = {"steps"},
plugin = {"pretty","html:target/cucumber-html-report.html"})

public class Runner extends TestBase {
}
