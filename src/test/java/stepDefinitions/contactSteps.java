package stepDefinitions;


import PageObjectModel.applicationPage;
import PageObjectModel.contactsPage;
import PageObjectModel.tabs;
import PageObjectModel.logInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class contactSteps {

    WebDriver driver;
    logInPage lp = new logInPage();
    tabs lv = new tabs();
    contactsPage cp = new contactsPage();
    applicationPage ap = new applicationPage();


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

    }

    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String firstName, String lastName) throws Throwable {
    cp.enterFname(firstName);
    cp.enterLname(lastName);
    Thread.sleep(2000);
    }

    @Then("^Click on save button$")
    public void click_on_save() throws Throwable {
    ap.setClickOnSave();

    }


    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
    driver.quit();
    }




}
