package tests;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Screenshot;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {

    HomePage homePage;


    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @Test
    public void test01() {
        Assert.assertTrue(homePage.joinNowBtn.isEnabled());
    }

    @Test
    public void test02() {
        Assert.assertTrue(homePage.joinNowBtn.isDisplayed());

    }

    @Test(testName = "ASTF-3 Parallax Section")
    public void test03() {
        homePage.isDisplayed(homePage.header1);
        homePage.isDisplayed(homePage.text1);
        Actions at = new Actions(getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn);
        Assert.assertEquals(getDriver().getTitle(), "Advance Systems - Services");
    }

    @Test(testName = "ASTF-5-01: Verify JOIN NOW button is above the main content")
    public void test04() {
        Point joinBtnLo = homePage.joinNowBtn.getLocation();
        Point socialMediaLinkLo = homePage.socialMediaLink.getLocation();
        System.out.println(joinBtnLo);
        System.out.println(socialMediaLinkLo);
        System.out.println(joinBtnLo.getX());
        System.out.println(socialMediaLinkLo.getX());
        Assert.assertTrue(joinBtnLo.getX() < socialMediaLinkLo.getX());

    }

    @Test(testName = "ASTF-5-02: JOIN NOW button should take the user to “Join Us")
    public void test05() {
        String joinUsTitle = "Advance Systems - Join Us";
        homePage.click(homePage.joinNowBtn);
        SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(joinUsTitle, getDriver().getTitle());
    }

    @Test(testName = "ASTF-3 Parallax Section 2")
    public void test06() {
        Actions at = new Actions(getDriver());
        homePage.waitForElementClickability(homePage.header2);
        homePage.isDisplayed(homePage.header2);
        homePage.isDisplayed(homePage.text2);
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn2);
    }
    @Test(testName = "ASTF-9 Testimonials")
    public void test9Testimonials() {
        homePage.isDisplayed(homePage.wordsFromOurClient);
        for (WebElement el : homePage.TextNameState) {
            homePage.moveIntoView(el);
            homePage.isDisplayed(el);


        }

    }
}




















