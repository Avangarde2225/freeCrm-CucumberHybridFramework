package stepDefinitions;


import PageObjectModel.contactsPage;
import PageObjectModel.leftNav;
import PageObjectModel.logInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class contactSteps {

    WebDriver driver;
    logInPage lp = new logInPage();
    leftNav lv = new leftNav();
    contactsPage cp = new contactsPage();


    @Given("^Go to the CRM page$")
    public void go_to_the_CRM_page() throws Throwable {
        driver = Driver.getDriver();

        driver.get(ReadProperties.getData("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @And("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        lp.typeInInputUserName();
        lp.typeInInputPassword();
        lp.clickOnbuttonLogin();
    }

    @And("^Click on contacts$")
    public void click_on_contacts() throws Throwable {
    lv.setClickOnContacts();
    }

    @And("^Click on new$")
    public void click_on_new() throws Throwable {
        cp.setClickOnNew();
    }

    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String arg1, String arg2) throws Throwable {

    }

    @Then("^Click on save$")
    public void click_on_save() throws Throwable {

    }

    @Then("^Verify the entry$")
    public void verify_the_entry() throws Throwable {

    }

    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {

    }




}
