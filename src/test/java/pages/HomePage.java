package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Join Now']")
    public WebElement joinNowBtn;


    @FindBy(xpath = "//section[@class='services-section']//div[@class='sec-title centered']")
    public WebElement secondSectionHeader;

    @FindBy(xpath = "//section[@class='services-section']//div[@class='title']")
    public WebElement secondSectionHeader1;

    @FindBy(xpath = "//section[@class='services-section']//div[@class='text']//p")
    public WebElement secondSectionHeader2;


    @FindBy(xpath = "//a/i[@class='fa fa-facebook-square']")
    public WebElement socialMediaLink;





}
