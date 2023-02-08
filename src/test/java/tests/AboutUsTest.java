package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.HomePage;


public class AboutUsTest extends BaseTest {
    AboutUsPage aboutUsPage;
    HomePage homePage;


    @BeforeMethod
    public void localSetUp() {
        aboutUsPage = new AboutUsPage(getDriver());
    }
    @Test
    public void test1() {
        homePage.aboutUsPageLink.click();
        for (WebElement element : aboutUsPage.whyChooseUsSection) {
            aboutUsPage.isDisplayed(element);
        }
    }
}
