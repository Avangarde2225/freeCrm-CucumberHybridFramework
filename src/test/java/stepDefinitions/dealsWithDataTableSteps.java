package stepDefinitions;

import PageObjectModel.logInPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class dealsWithDataTableSteps {
    WebDriver driver;
    logInPage lp = new logInPage();

//    @Given("^User is already on the Login Page$")
//    public void user_is_already_on_the_Login_Page() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://classic.freecrm.com/index.html");
//    }

    @When("^Title of Login Page is Free CRM$")
    public void title_of_Login_Page_is_Free_CRM() {
        String title = driver.getTitle();
        System.out.printf(title);
        Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
    }

    @Then("^Type the username and password$")
    public void type_the_username_and_password(DataTable credentials) {
        List<List<String>> data = credentials.raw();

        driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

    }

    @Then("^User clicks on the Login Button$")
    public void user_clicks_on_the_Login_Button() {
        lp.clickOnbuttonLogin();
    }

    @Then("^User is on the home page$")
    public void user_is_on_the_home_page() {
        String title = driver.getTitle();
        System.out.println("Home page title : " + title);
        Assert.assertEquals("CRMPRO", title);
    }

    @Then("^User moves over to Deal Page$")
    public void user_moves_over_to_Deal_Page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
    }

    @Then("^User enters deal details$")
    public void user_enters_deal_details(DataTable dealData) {
        List<List<String>> dealValues = dealData.raw();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys(dealValues.get(0).get(0));
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(dealValues.get(0).get(1));
        driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(dealValues.get(0).get(2));
        driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(dealValues.get(0).get(3));

    }
}
