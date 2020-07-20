package Runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = "@SmokeTest",

        features = "Features",
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = true


)

public class TestRunner {

}
