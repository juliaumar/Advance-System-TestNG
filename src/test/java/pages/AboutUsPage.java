package pages;


import base.BasePage;
import base.BaseTest;
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
    @FindBy(className = "services-block-four")
    public List<WebElement> whyChooseUs;
}
