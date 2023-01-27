package tests;

import base.BaseTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import utils.ExtentManager;
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
    @Test(testName = "Parallax Section")
    public void test03(){
        homePage.isDisplayed(homePage.header1);
        homePage.isDisplayed(homePage.text1);
        Actions at = new Actions(getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn);
        Assert.assertEquals( getDriver().getTitle(), "Advance Systems - Services");
        Screenshot.takeScreenshot(getDriver());
        getDriver().navigate().back();
        homePage.waitForElementClickability(homePage.header2);
        homePage.isDisplayed(homePage.header2);
        Screenshot.takeScreenshot(getDriver());
        homePage.isDisplayed(homePage.text2);
        at.sendKeys(Keys.PAGE_UP).build().perform();
        homePage.click(homePage.readMoreBtn2);





    }


}



















