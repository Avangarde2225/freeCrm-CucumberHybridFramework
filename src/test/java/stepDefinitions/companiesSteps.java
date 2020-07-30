package stepDefinitions;

import PageObjectModel.applicationPage;
import PageObjectModel.companiesPage;
import PageObjectModel.logInPage;
import PageObjectModel.tabs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class companiesSteps {
    WebDriver driver;
    tabs lv = new tabs();
    logInPage lp = new logInPage();
    applicationPage ap = new applicationPage();
    companiesPage cp = new companiesPage();

    @Given("^Go to the CRM page$")
    public void go_to_the_CRM_page()  {
        driver = Driver.getDriver();

        driver.get(ReadProperties.getData("Url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @And("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button(){
        lp.typeInInputUserName();
        lp.typeInInputPassword();
        lp.clickOnbuttonLogin();
    }


    @Then("^Hover over on companies and click on new company$")
    public void hover_over_on_companies() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Companies')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Company')]")).click();
    }

    @Then("^Enter company details \"([^\"]*)\"$")
    public void enter_company_details(String name) {
        cp.enterCompanyName(name);
    }

    @Then("^Click on the company save button$")
    public void click_on_save()  {
        driver.findElement(By.xpath("//input[@id='company_name']")).click();

    }


    @Then("^Close the browser$")
    public void close_the_browser()  {
        driver.quit();
    }
}
