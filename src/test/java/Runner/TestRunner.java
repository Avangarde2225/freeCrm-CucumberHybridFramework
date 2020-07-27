package Runner;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = "@SmokeTest",

        features = {"src/test/resources"},
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = false


)

public class TestRunner extends AbstractTestNGCucumberTests {

}
