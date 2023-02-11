package tests;

import base.BaseTest;

import data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AboutUsPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AboutUsTest extends BaseTest {
    AboutUsPage aboutUsPage;

    @BeforeMethod
    public void localSetUp() {
        aboutUsPage = new AboutUsPage(getDriver());
    }

    @Test(testName = "ASTF-27: Verify if experts section is displayed", dataProviderClass = DataProviders.class, dataProvider = "experts")
    public void testASTF27(int position, String url, String name, String title, String description) {
        aboutUsPage.aboutLink.click();
        aboutUsPage.isDisplayed(aboutUsPage.expertsHeader);
        aboutUsPage.verifyExpertsWithPosition(position, url, name, title, description);
    }

    @Test(testName = "ASTF-29: About Us page: Why Us")
    public void testASTF29() {
        aboutUsPage.aboutLink.click();

        int i;
        for (i = 0; i < aboutUsPage.whyChooseUsSection.size(); i++) {
            aboutUsPage.moveElementToTheMiddleOfView(aboutUsPage.whyChooseUsSection.get(i));
            aboutUsPage.highlightElement(aboutUsPage.whyChooseUsSection.get(i).findElement(By.cssSelector("h3")));
            Assert.assertEquals(aboutUsPage.whyChooseUsSection.get(i).findElement(By.cssSelector("h3")).getText(), aboutUsPage.whyChooseUsSectionDesc[i]);

        }
        Assert.assertEquals(aboutUsPage.whyChooseUsSection.size(), 4);
    }
}