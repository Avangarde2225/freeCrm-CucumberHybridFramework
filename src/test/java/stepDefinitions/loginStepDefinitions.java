package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginStepDefinitions {
    WebDriver driver;

    @Given("^User is on the Login Page$")
    public void user_is_on_the_Login_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
    }

    @When("^Title of Login Pages is Free CRM$")
    public void title_of_Login_Pages_is_Free_CRM() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM",title);
    }

    @Then("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password)  {
            driver.findElement(By.xpath("//*[@placeholder='E-mail address']")).sendKeys(username);
            driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
    }

    @Then("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        WebElement loginBtn = driver.findElement(By.xpath("//html//body//div//div//div//form//div//div[contains(text(),'Login')]"));
        loginBtn.click();

        //        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argument[0].click();", loginBtn);
    }

    @Then("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
        String url= driver.getCurrentUrl();
        System.out.println("Homepage title is " + url);
        Assert.assertEquals("https://ui.cogmento.com/", url);

    }
}
