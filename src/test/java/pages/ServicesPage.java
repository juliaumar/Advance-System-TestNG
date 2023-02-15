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

    @FindBy(xpath = "//*[@class='image']")
    public WebElement img;

    @FindBy(xpath = "//*[contains(text(), 'Not only do we provide services to the finance and technology world')]")
    public WebElement text;

    @FindBy(xpath = "//*[text()='Finance']")
    public WebElement financeLink;
    @FindBy(xpath = "//div[@class='contact-info-four']/div[1]")
     public WebElement address;
    @FindBy(xpath = "//div[@class='contact-info-four']/div[2]")
    public WebElement phone;

    @FindBy(xpath = "//*[contains(text(),'Lorem Ipsum is simply dummy')]")
    public WebElement quote;


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

    public void verifyOurDivisions() {
        for (WebElement division : ourDivisions) {
            click(division);
            System.out.println(driver.getTitle());
            isDisplayed(img);
            isDisplayed(text);
            isDisplayed(quote);
            driver.navigate().back();

        }
    }



}