package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactsPage extends AbstractClass {
    private WebDriver driver;

    public contactsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement enterFirstName;
    public void enterFname(String fName){sendKeys(enterFirstName,fName);}

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement enterLastName;
    public void enterLname(String Lname){sendKeys(enterLastName,Lname);}







}
