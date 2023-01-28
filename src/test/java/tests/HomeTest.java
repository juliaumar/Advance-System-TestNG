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
    @Test(testName = "Verify JOIN NOW button is above the main content")
    public void test03(){
        Point joinBtnLo = homePage.joinNowBtn.getLocation();
        Point socialMediaLinkLo = homePage.socialMediaLink.getLocation();
        System.out.println(joinBtnLo);
        System.out.println(socialMediaLinkLo);
        System.out.println(joinBtnLo.getX());
        System.out.println(socialMediaLinkLo.getX());

        Assert.assertTrue(joinBtnLo.getX() < socialMediaLinkLo.getX());
        
    }
    @Test(testName = "JOIN NOW button should take the user to “Join Us")
    public void test04(){
        String joinUsTitle = "Advance Systems - Join Us";

        homePage.joinNowBtn.click();
        SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);

        Assert.assertEquals(joinUsTitle, getDriver().getTitle());
    }

}



















