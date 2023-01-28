package tests;

import base.BaseTest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Point;
import org.testng.Assert;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
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
    @Test(testName = "ASTF-5-01: Verify JOIN NOW button is above the main content")
    public void test03(){
        Point joinBtnLo = homePage.joinNowBtn.getLocation();
        Point socialMediaLinkLo = homePage.socialMediaLink.getLocation();
        System.out.println(joinBtnLo);
        System.out.println(socialMediaLinkLo);
        System.out.println(joinBtnLo.getX());
        System.out.println(socialMediaLinkLo.getX());

        Assert.assertTrue(joinBtnLo.getX() < socialMediaLinkLo.getX());
        
    }
    @Test(testName = "ASTF-5-02: JOIN NOW button should take the user to “Join Us")
    public void test04(){
        String joinUsTitle = "Advance Systems - Join Us";

        homePage.click(homePage.joinNowBtn);
        SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);

        Assert.assertEquals(joinUsTitle, getDriver().getTitle());
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


}



















