package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class companiesPage extends AbstractClass{
    private WebDriver driver;

    public companiesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='ui right corner labeled input']//input[@name='name']")
    private WebElement enterCompanyName;

    public void enteringCompany(String name){sendKeys(enterCompanyName,name);}
}