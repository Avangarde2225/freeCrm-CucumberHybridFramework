package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class logInPage extends AbstractClass{

    private WebDriver driver;

    public logInPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//*[@placeholder='E-mail address']")
    private WebElement inputUserName;

    public void typeInInputUserName(){
        sendKeys(inputUserName, ReadProperties.getData("Username"));
    }

    @FindBy(xpath="//*[@placeholder='Password']")
    private WebElement inputPassword;

    public void typeInInputPassword(){
        sendKeys(inputPassword,ReadProperties.getData("Password"));
    }

    @FindBy(xpath="//html//body//div//div//div//form//div//div[contains(text(),'Login')]")
    private WebElement buttonLogin;

    public void clickOnbuttonLogin(){
        clickFunction(buttonLogin);
    }

}
