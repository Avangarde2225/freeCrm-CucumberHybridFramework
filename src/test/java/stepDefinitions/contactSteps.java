package stepDefinitions;


import PageObjectModel.applicationPage;
import PageObjectModel.contactsPage;
import PageObjectModel.tabs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;


public class contactSteps {

    WebDriver driver;

    tabs lv = new tabs();
    contactsPage cp = new contactsPage();
    applicationPage ap = new applicationPage();

    @Then("^Hover over on contacts and click on new contact$")
    public void hover_over_on_contacts_and_click_on_new_contact() ] {

    }

    @And("^Click on contacts$")
    public void click_on_contacts() {
    lv.setClickOnContacts();
    }



    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String firstName, String lastName) throws Throwable {
    cp.enterFname(firstName);
    cp.enterLname(lastName);

    }






}
