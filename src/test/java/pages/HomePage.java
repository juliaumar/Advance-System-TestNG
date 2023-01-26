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
  //  @FindBy(xpath = "//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse collapse clearfix']//ul//a")
  //  public List<WebElement> links;

    @FindBy(xpath = "//a[text()='Join Now']")
    public WebElement joinNowBtn;


}
