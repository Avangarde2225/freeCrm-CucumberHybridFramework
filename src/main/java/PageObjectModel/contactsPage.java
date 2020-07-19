package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactsPage extends AbstractClass {
    private WebDriver driver;

    public contactsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


}
