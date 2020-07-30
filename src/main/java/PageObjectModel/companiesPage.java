package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class companiesPage extends AbstractClass {
    private WebDriver driver;

    public companiesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='company_name']")
    private WebElement enteringCompanyName;

    public void enterCompanyName(String name){
        sendKeys(enteringCompanyName,name);
    }
}
