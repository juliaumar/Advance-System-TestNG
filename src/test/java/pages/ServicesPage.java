package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ServicesPage extends BasePage {
    protected WebDriver driver;

    public ServicesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='services.html']")
    public WebElement servicesLink;

    @FindBy(xpath = "//div[@class='mixitup-gallery']//a//h4")
    public List<WebElement> ourDivisions;

    @FindBy(xpath = "//ul[@class='boucher']//li")
    public List<WebElement> navBarLinks;

    @FindBy(xpath = "//*[text()='Finance']")
    public WebElement financeLink;
    @FindBy(xpath = "//div[@class='contact-info-four']/div[1]")
     public WebElement address;
    @FindBy(xpath = "//div[@class='contact-info-four']/div[2]")
    public WebElement phone;


    public void setNavBarLinks() {
        for(WebElement link : navBarLinks) {
           isDisplayed(link);
           isDisplayed(address);
            isDisplayed(phone);
        }
    }

    @FindBy(className = "boucher-area")
    public WebElement ourDivisionsBoucher;

    public String title = "Advance Systems - Services";

   // @FindBy(xpath = "//img[@src='images/resource/division-finance.jpg']")
  //  public WebElement financeImg;

    //img[@src='images/resource/division-it.jpg']



}