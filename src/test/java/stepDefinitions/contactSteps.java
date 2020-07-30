package stepDefinitions;


import PageObjectModel.applicationPage;
import PageObjectModel.contactsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class contactSteps {

    WebDriver driver;
    contactsPage cp = new contactsPage();
    applicationPage ap = new applicationPage();

    @Then("^Hover over on contacts and click on new contact$")
    public void hover_over_on_contacts_and_click_on_new_contact() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
    }

    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String firstName, String lastName) {
    cp.enterFname(firstName);
    cp.enterLname(lastName);

    }

    @Then("^Click on save button$")
    public void click_on_save_button() {
       ap.setClickOnSave();
    }









}
