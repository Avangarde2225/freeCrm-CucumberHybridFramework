package stepDefinitions;

import PageObjectModel.*;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class companiesSteps {
    WebDriver driver;
    tabs lv = new tabs();
    applicationPage ap = new applicationPage();
    companiesPage cp = new companiesPage();

    @Then("^Click on new company$")
    public void click_on_new_company()  {

    }

    @Then("^Enter company details \"([^\"]*)\"$")
    public void enter_company_details(String arg1)  {

    }
}
