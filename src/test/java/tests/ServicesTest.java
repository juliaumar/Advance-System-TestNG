package tests;

import base.BaseTest;
import data.DataProviders;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.ServicesPage;
import utils.SeleniumUtils;

import java.awt.*;

public class ServicesTest extends BaseTest {
    ServicesPage servicesPage;


    @BeforeMethod
    public void localSetUp() {
        servicesPage = new ServicesPage(getDriver());
        servicesPage.servicesLink.click();
    }

    @Test(testName = "ASTF-30 Our Services page: Divisions")
    public void testASTF30() {

        for (WebElement division : servicesPage.ourDivisions) {
            servicesPage.isDisplayed(division);
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.PAGE_UP).build().perform();
            servicesPage.click(division);
            System.out.println(getDriver().getTitle());
            getDriver().navigate().back();

        }

    }

    @Test(testName = "ASTF-31 Division page: Mini nav bar")
    public void testASTF31() {

        String currentBtn = "current-btn";

        servicesPage.click(servicesPage.ourDivisions.get(0));

        for (int i = 0; i < servicesPage.navBarLinks.size(); i++) {
            servicesPage.moveElementToTheMiddleOfView(servicesPage.navBarLinks.get(i));
            servicesPage.clickWithoutMoving(servicesPage.navBarLinks.get(i));
            Assert.assertEquals(servicesPage.navBarLinks.get(i).getAttribute("id"), currentBtn);
        }

    }
    @Test(testName = "ASTF-32 Our Division: Contact info")
    public void testASTF32()  {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(servicesPage.financeLink).build().perform();
        servicesPage.click(servicesPage.financeLink);
        servicesPage.setNavBarLinks();
    }
}