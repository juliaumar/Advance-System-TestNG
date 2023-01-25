package tests;

import base.BaseTest;

import org.testng.Assert;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;



public class HomeTest extends BaseTest  {

    HomePage homePage;


    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }
    @Test
    public void test01(){
        Assert.assertTrue(homePage.joinNowBtn.isEnabled());

    }

    @Test
    public void test02() {
        Assert.assertTrue(homePage.joinNowBtn.isDisplayed());
    }

    @Test(testName = "navBar links")
    public void test03(){
        for (WebElement link: homePage.links) {
            homePage.isDisplayed(link);

        }
    }


    }
















