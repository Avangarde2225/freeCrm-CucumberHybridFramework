package stepDefinitions;

import PageObjectModel.*;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class companiesSteps {
    WebDriver driver;
    leftNav lv = new leftNav();
    applicationPage ap = new applicationPage();
    companiesPage cp = new companiesPage();

    @Given("^Click on companies$")
    public void click_on_companies() {
       lv.setClickOnCompanies();
    }

    @Given("^Enter company details \"([^\"]*)\"$")
    public void enter_company_details(String name)  {
    cp.enteringCompany(name);
    }
}
