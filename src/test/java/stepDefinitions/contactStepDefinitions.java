package stepDefinitions;


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

public class contactStepDefinitions {

    WebDriver driver;

    @Given("^User is on the Login Page$")
    public void user_is_on_the_Login_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");

        driver = Driver.getDriver();

        driver.get(ReadProperties.getData("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @When("^Title of Login Pages is Free CRM$")
    public void title_of_Login_Pages_is_Free_CRM() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM",title);
    }

    @Then("^User enters Username and Password$")
    public void user_enters_Username_and_Password(String username, String password) throws Throwable {
        driver.findElement(By.xpath("//*[@placeholder='E-mail address']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
    }



    @Then("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        WebElement loginBtn = driver.findElement(By.xpath("//html//body//div//div//div//form//div//div[contains(text(),'Login')]"));
        loginBtn.click();

        Thread.sleep(5000);


        //        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argument[0].click();", loginBtn);
    }

    @Then("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
        String url= driver.getCurrentUrl();
        System.out.println("Homepage title is " + url);
        Assert.assertEquals("https://ui.cogmento.com/", url);

    }

    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }

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
