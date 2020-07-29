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
    @FindBy(xpath = "//span[contains(text(),'Companies')]")
    private WebElement clickOnCompanies;
    public void setClickOnCompanies(){clickFunction(clickOnCompanies);}

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    private WebElement clickOnContacts;
    public void setClickOnContacts(){clickFunction(clickOnContacts);}



    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    private WebElement clickOnDeals;
    public void setClickOnDeals(){clickFunction(clickOnDeals);}

    @FindBy(xpath = "//span[contains(text(),'Tasks')]")
    private WebElement clickOnTasks;
    public void setClickOnTasks(){clickFunction(clickOnTasks);}

    @FindBy(xpath = "//span[contains(text(),'Cases')]")
    private WebElement clickOnCases;
    public void setClickOnCases(){clickFunction(clickOnCases);}

    @FindBy(xpath = "//span[contains(text(),'Calls')]")
    private WebElement clickOnCalls;
    public void setClickOnCalls(){clickFunction(clickOnCalls);}

    @FindBy(xpath = "//span[contains(text(),'Documents')]")
    private WebElement clickOnDocuments;
    public void setClickOnDocuments(){clickFunction(clickOnDocuments);}

    @FindBy(xpath = "//span[contains(text(),'Email')]")
    private WebElement clickOnEmail;
    public void setClickOnEmail(){clickFunction(clickOnEmail);}

    @FindBy(xpath = "//span[contains(text(),'Campaigns')]")
    private WebElement clickOnCampaigns;
    public void setClickOnCampaigns(){clickFunction(clickOnCampaigns);}

    @FindBy(xpath = "//span[contains(text(),'Forms')]")
    private WebElement clickOnForms;
    public void setClickOnForms(){clickFunction(clickOnForms);}


}
