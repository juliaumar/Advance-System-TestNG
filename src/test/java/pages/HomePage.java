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


    //julia Parallax Section
    @FindBy(xpath = "//h2[normalize-space()='A bright career iswaiting for you...']")
    public WebElement header1;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[4]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li")
    public List<WebElement> secondNavBarBtns;


    @FindBy(xpath = "//a/i[@class='fa fa-facebook-square']")
    public WebElement socialMediaLink;


    //julia Parallax Section
    @FindBy(xpath = "//h2[normalize-space()='Think Big.Achieve Bigger.']")
    public WebElement header2;

    //julia Parallax Section
    @FindBy(xpath = "//li[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
    public WebElement text1;

    //julia Parallax Section
    @FindBy(xpath = "//ul[1]/li[2]/div[3]/div[1]/div[1]/div[1]/div[1]")
    public WebElement text2;

    //julia Parallax Section
    @FindBy(xpath = "//li[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
    public WebElement readMoreBtn;


    //julia Parallax Section
    @FindBy(xpath = "//ul[1]/li[2]/div[4]/div[1]/div[1]/div[1]/a[1]")
    public WebElement readMoreBtn2;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//div[@class='footer-newsletter footer-column-border col-lg-4 col-md-6 col-sm-6 col-xs-12']")
    public WebElement newLetterSection;

    @FindBy(xpath = "//h2[normalize-space()='Words from our Clients']")
    public WebElement wordsFromOurClient;

    @FindBy(xpath = "//section[contains (@class,'testimonial')]//div[contains (@class,'active')]")
    public List<WebElement> TextNameState;


    @FindBy(xpath = "//footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li")
    public List<WebElement> footerInfos;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li")
    public List<WebElement>  address;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li")
    public List<WebElement> phone;


    @FindBy(xpath = "//ul[@class='social-icon-seven']//li//a")
    public List<WebElement> socialLinks;


}





















