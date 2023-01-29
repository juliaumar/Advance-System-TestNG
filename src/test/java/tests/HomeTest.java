package tests;

import base.BasePage;
import base.BaseTest;

import data.DataProviders;
import org.testng.Assert;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;


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