package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.ServicesPage;
import utils.SeleniumUtils;

public class ServicesTest extends BaseTest {
    ServicesPage servicesPage;


    @BeforeMethod
    public void localSetUp() {
        servicesPage = new ServicesPage(getDriver());
    }

    @Test(testName = "ASTF-30 Our Services page: Divisions")
    public void testASTF30(){
        servicesPage.servicesLink.click();
        for (WebElement division : servicesPage.ourDivisions) {
            servicesPage.isDisplayed(division);
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.PAGE_UP).build().perform();
            servicesPage.click(division);
            System.out.println(getDriver().getTitle());
            getDriver().navigate().back();

        }

    }
}