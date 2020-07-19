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

    @FindBy(xpath = "//button[contains(text(),'New')]")
    private WebElement clickOnNew;

    public void setClickOnNew(){clickFunction(clickOnNew);}







}
