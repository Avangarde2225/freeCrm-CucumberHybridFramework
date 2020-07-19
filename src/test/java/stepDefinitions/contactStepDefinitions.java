package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

public class contactStepDefinitions {

    WebDriver driver;

    @Then("^User clicks on contacts button$")
    public void user_clicks_on_contacts_button() throws Throwable {
        driver.findElement(By.xpath("//*[contains(text(),'Contacts')]")).click();
    }

    @Then("^User touches on new icon$")
    public void user_touches_on_new_icon() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
    }

    @Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_contact_details_and(String firstName, String lastName) throws Throwable {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
    }

    @Then("^User clicks on Save button$")
    public void user_clicks_on_Save_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
    }




}
