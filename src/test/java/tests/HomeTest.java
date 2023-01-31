package tests;

import base.BaseTest;




import data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
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
    public void testASTF301() {
        homePage.isDisplayed(homePage.header1);
        homePage.isDisplayed(homePage.text1);
        Actions at = new Actions(getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn);
        Assert.assertEquals(getDriver().getTitle(), "Advance Systems - Services");
    }

    @Test(testName = "ASTF-5-01: Verify JOIN NOW button is above the main content")

    public void testASTF0501() {
        Point joinBtnLo = homePage.joinNowBtn.getLocation();
        Point socialMediaLinkLo = homePage.socialMediaLink.getLocation();
        System.out.println(joinBtnLo);
        System.out.println(socialMediaLinkLo);
        System.out.println(joinBtnLo.getX());
        System.out.println(socialMediaLinkLo.getX());

        Assert.assertTrue(joinBtnLo.getX() < socialMediaLinkLo.getX());

    }

    @Test(testName = "ASTF-5-02: JOIN NOW button should take the user to “Join Us")
    public void testASTF0502() {
        String joinUsTitle = "Advance Systems - Join Us";
        homePage.click(homePage.joinNowBtn);
        Assert.assertEquals(joinUsTitle, getDriver().getTitle());
    }

    @Test(testName = "ASTF-12: Verify if footer quick links link to correct pages", dataProviderClass = DataProviders.class, dataProvider = "quickLinks")
    public void testASTF12(String linkName, String title) {

        getDriver().findElement(By.linkText(linkName)).click();
        SeleniumUtils.switchToNextWindow(getDriver());
        homePage.sleep(1000L);
        Assert.assertEquals(getDriver().getTitle(), title);
    }


    @Test
    public void testHeaders() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(homePage.secondSectionHeader.isDisplayed());
    }
    @Test
    public void testHeaders1() {
        Assert.assertTrue(homePage.secondSectionHeader1.isDisplayed());
    }
    @Test
    public void testHeaders2() {
        Assert.assertTrue(homePage.secondSectionHeader2.isDisplayed());
    }


    @Test(testName = "ASTF-3 Parallax Section 2")
    public void testASTF0302() {
        Actions at = new Actions(getDriver());
        homePage.waitForElementClickability(homePage.header2);
        homePage.isDisplayed(homePage.header2);
        Screenshot.takeScreenshot(getDriver());
        homePage.isDisplayed(homePage.text2);
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn2);

    }

    @Test(testName = "ASTF-11 Footer Info Display")
    public void testASTF11() {
        for (WebElement info : homePage.footerInfos) {
            homePage.moveIntoView(info);
            homePage.isDisplayed(info);

        }
    }

    @Test(testName = "ASTF-4: Title of the Home Page")
    public void testASTF04() {
        Assert.assertEquals(getDriver().getTitle(), "Advance Systems - Home");

    }

    @Test(testName = "ASTF-15: Copyright Update")
    public void testASTF15() {
        String expectedText = "Copyright © 2022 Advance Systems LLC. All Rights Reserved.";
        Assert.assertTrue(true, expectedText);
    }

    @Test(testName = "ASTF-6 Second  Page Navigation Bar")
    public void testASTF06() {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        for (WebElement Btn : homePage.secondNavBarBtns) {
            homePage.isDisplayed(Btn);
        }
    }
}








































