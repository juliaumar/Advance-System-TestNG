package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AboutUsPage extends BasePage {

    protected WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='services-block-four col-lg-4 col-md-6 col-sm-12']")
    public List<WebElement> whyChooseUsSection;
}
