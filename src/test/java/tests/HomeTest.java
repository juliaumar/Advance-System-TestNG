package tests;

import base.BaseTest;
import data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;



public class HomeTest extends BaseTest implements CommonPage {

    HomePage homePage;


    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }
    @Test(testName = "navBar links")
    public void test01(){
        for (WebElement link: homePage.links) {
            homePage.isDisplayed(link);

        }
    }



}














