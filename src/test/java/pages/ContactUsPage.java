package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
    protected WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[href='contact.html']")
    public WebElement contactLink;

    @FindBy(xpath = " //div[@class='google-map'][@data-map-title='Fairfax, VA, USA']")
    public WebElement map;






}
