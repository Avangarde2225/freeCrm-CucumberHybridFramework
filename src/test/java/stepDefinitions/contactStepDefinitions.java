package stepDefinitions;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Then;

public class contactStepDefinitions {

    WebDriver driver;

    @Then("^User moves to Contacts page$")
    public void user_moves_to_Contacts_page() {
    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
    }

    @Then("^User touches on new icon$")
    public void user_touches_on_new_icon() throws Throwable {
    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
    }

    @Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersContactDetailsAnd(String firstname, String lastname) throws Throwable {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
    }

    @Then("^User clicks on Save button$")
    public void user_clicks_on_Save_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

    }


}
