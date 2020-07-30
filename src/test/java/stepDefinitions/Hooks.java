package stepDefinitions;

import cucumber.api.Scenario;


import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    @After
    public void afterClass(Scenario scenario) throws IOException {

        if(scenario.isFailed()){
            TakesScreenshot screenshot = ((TakesScreenshot) Driver.getDriver());

            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            String featureFileName = scenario.getId();
            System.out.println(featureFileName);

            File destinationFile = new File("target/screenshot/"+featureFileName +".png");
            FileUtils.copyFile(srcFile, destinationFile);


        }

        Driver.closeDriver();
    }
}
