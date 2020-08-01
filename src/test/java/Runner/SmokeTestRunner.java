package Runner;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = "@SmokeTest",

        features = {"src/test/resources/Features"},
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = false


)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}
