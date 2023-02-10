package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

}