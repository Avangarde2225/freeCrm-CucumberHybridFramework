package stepDefinitions;


import PageObjectModel.applicationPage;
import PageObjectModel.contactsPage;
import PageObjectModel.tabs;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class contactSteps {

    WebDriver driver;
    contactsPage cp = new contactsPage();
    applicationPage ap = new applicationPage();
    tabs lv = new tabs();



    @And("^Hover over on Contacts and click on New Contact$")
    public void hover_over_on_contacts_and_click_on_new_contact() {

        driver.switchTo().frame("mainpanel");
        int size = driver.findElements(By.name("mainpanel")).size();
        System.out.println(size);

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();

        lv.setClickOnContacts();
    }

    @And("^Enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_contact_details_and(String firstName, String lastName) {
    cp.enterFname(firstName);
    cp.enterLname(lastName);

    }

    @And("^Click on save button$")
    public void click_on_save_button() {
       ap.setClickOnSave();
    }



}
