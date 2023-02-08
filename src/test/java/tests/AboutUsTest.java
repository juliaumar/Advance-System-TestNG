package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.HomePage;
import utils.ConfigReader;

public class AboutUsTest extends BaseTest{
    AboutUsPage aboutUsPage;
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        aboutUsPage = new AboutUsPage(getDriver());
        homePage = new HomePage(getDriver());
    }
    @Test
    public void testLinks() {
        homePage.click(homePage.aboutUsLink);
        for (WebElement element : aboutUsPage.whyChooseUs) {
            aboutUsPage.isDisplayed(element);
        }
    }
}
