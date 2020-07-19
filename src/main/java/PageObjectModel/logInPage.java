package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class logInPage extends AbstractClass{

    private WebDriver driver;

    public logInPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


}
