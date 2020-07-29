package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class applicationPage extends AbstractClass{

    private WebDriver driver;

    public applicationPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tr[8]//td[1]//input[1]")
    private WebElement clickOnSave;
    public void setClickOnSave(){clickFunction(clickOnSave);}
}
