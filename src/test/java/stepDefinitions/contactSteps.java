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

    tabs lv = new tabs();
    contactsPage cp = new contactsPage();
    applicationPage ap = new applicationPage();



    @And("^Click on contacts$")
    public void click_on_contacts() {
    lv.setClickOnContacts();
    }



    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String firstName, String lastName) throws Throwable {
    cp.enterFname(firstName);
    cp.enterLname(lastName);
    Thread.sleep(2000);
    }






}
