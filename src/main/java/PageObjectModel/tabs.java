package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class tabs extends AbstractClass{
    private WebDriver driver;

    public tabs() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'New Company')]")
    private WebElement clickOnCompanies;
    public void setClickOnCompanies(){clickFunction(clickOnCompanies);}

    @FindBy(xpath = "//a[contains(text(),'New Contact')]")
    private WebElement clickOnContacts;
    public void setClickOnContacts(){clickFunction(clickOnContacts);}

    @FindBy(xpath = "//a[contains(text(),'New Deal')]")
    private WebElement clickOnDeals;
    public void setClickOnDeals(){clickFunction(clickOnDeals);}

    @FindBy(xpath = "//a[contains(text(),'New Task')]")
    private WebElement clickOnTasks;
    public void setClickOnTasks(){clickFunction(clickOnTasks);}

    @FindBy(xpath = "//a[contains(text(),'New Case')]")
    private WebElement clickOnCases;
    public void setClickOnCases(){clickFunction(clickOnCases);}

    @FindBy(xpath = "//a[contains(text(),'New Call')]")
    private WebElement clickOnCalls;
    public void setClickOnCalls(){clickFunction(clickOnCalls);}

    @FindBy(xpath = "(//a[contains(text(),'New Email Campaign')])[1]")
    private WebElement clickOnEmail;
    public void setClickOnEmail(){clickFunction(clickOnEmail);}

    @FindBy(xpath = "(//a[contains(text(),'New Text/SMS Campaign')])[1]")
    private WebElement clickOnTextCampaigns;
    public void setClickOnCampaigns(){clickFunction(clickOnTextCampaigns);}

    @FindBy(xpath = "(//a[contains(text(),'New Print Campaign')])[1]")
    private WebElement clickOnPrintCampaign;
    public void setClickOnPrintCampaign(){clickFunction(clickOnPrintCampaign);}


}
