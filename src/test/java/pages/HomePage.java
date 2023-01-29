package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExtentManager;
import utils.SeleniumUtils;

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

    @FindBy(xpath = "//a/i[@class='fa fa-facebook-square']")
    public WebElement socialMediaLink;

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-12']//ul")
    public List<WebElement> footerQuickLinks;


    public boolean doesStatementExist(String statement){
        for(WebElement element: footerQuickLinks){
            if (getText(element).equalsIgnoreCase(statement))
                return true;
        }
        return false;
    }


}
