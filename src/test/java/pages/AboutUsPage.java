package pages;

import base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AboutUsPage extends BasePage {
    protected WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='about.html']")
    public WebElement aboutLink;

    @FindBy(xpath = "//div[@class='sec-title']")
    public WebElement expertsHeader;

    @FindBy(className = "team-member-one")
    public List<WebElement> experts;

    public void verifyExpertsWithPosition(int position, String imgURL, String name, String title, String description) {
        Assert.assertTrue(experts.get(position).findElement(By.cssSelector("img")).getAttribute("src").contains(imgURL));
        Assert.assertEquals(experts.get(position).findElement(By.cssSelector("h3")).getText(), name);
        Assert.assertEquals(experts.get(position).findElement(By.className("designation")).getText(), title);
        Assert.assertEquals(experts.get(position).findElement(By.className("text")).getText(), description);
        verifySocialMedia(experts.get(position).findElement(By.className("fa-facebook")), "https://www.facebook.com/");
        verifySocialMedia(experts.get(position).findElement(By.className("fa-twitter")), "https://twitter.com/");
        verifySocialMedia(experts.get(position).findElement(By.className("fa-skype")), "https://www.skype.com/en/");
        verifySocialMedia(experts.get(position).findElement(By.className("fa-linkedin")), "https://www.linkedin.com/");
    }

    private void verifySocialMedia(WebElement social, String socialMedia) {
        Assert.assertTrue(social.isDisplayed());
        social.click();
        driver.navigate().forward();
        Assert.assertEquals(driver.getCurrentUrl(), socialMedia);
        driver.navigate().back();
    }
}