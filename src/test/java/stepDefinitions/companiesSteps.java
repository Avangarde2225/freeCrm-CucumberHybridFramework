package stepDefinitions;

import PageObjectModel.*;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class companiesSteps {
    WebDriver driver;
    tabs lv = new tabs();
    applicationPage ap = new applicationPage();
    companiesPage cp = new companiesPage();

    @Then("^Hover over on companies$")
    public void hover_over_on_companies() throws Throwable {
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'New Company')]"))).build().perform();

    }

    @Then("^Click on new company$")
    public void click_on_new_company()  {
    cp.setClickOnNewCompany();
    }

    @Then("^Enter company details \"([^\"]*)\"$")
    public void enter_company_details(String name)  {
    cp.enterCompanyName(name);
    }
}
