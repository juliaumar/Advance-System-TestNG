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
import pages.ServicesPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AboutUsTest extends BaseTest {
    AboutUsPage aboutUsPage;
    ServicesPage servicesPage;

    @BeforeMethod
    public void localSetUp() {
        aboutUsPage = new AboutUsPage(getDriver());
        servicesPage = new ServicesPage(getDriver());
        aboutUsPage.aboutLink.click();
    }

    @Test(testName = "ASTF-27: Verify if experts section is displayed", dataProviderClass = DataProviders.class, dataProvider = "experts")
    public void testASTF27(int position, String url, String name, String title, String description) {

        aboutUsPage.isDisplayed(aboutUsPage.expertsHeader);
        aboutUsPage.verifyExpertsWithPosition(position, url, name, title, description);
    }

    @Test(testName = "ASTF-29: About Us page: Why Us")
    public void testASTF29() {

        int i;
        for (i = 0; i < aboutUsPage.whyChooseUsSection.size(); i++) {
            aboutUsPage.moveElementToTheMiddleOfView(aboutUsPage.whyChooseUsSection.get(i));
            aboutUsPage.highlightElement(aboutUsPage.whyChooseUsSection.get(i).findElement(By.cssSelector("h3")));
            Assert.assertEquals(aboutUsPage.whyChooseUsSection.get(i).findElement(By.cssSelector("h3")).getText(), aboutUsPage.whyChooseUsSectionDesc[i]);

        }
        Assert.assertEquals(aboutUsPage.whyChooseUsSection.size(), 4);
    }

    @Test(testName = "ASTF-26: About Us page: Why Us section")
    public void testASTF26() {

        aboutUsPage.moveElementToTheMiddleOfView(aboutUsPage.chooseUsSection);
        aboutUsPage.highlightElement(aboutUsPage.chooseUsSection);

        for (int i = 0; i < aboutUsPage.chooseUsSectionEachEl.size(); i++) {
            Assert.assertEquals(aboutUsPage.chooseUsSectionEachEl.get(i).findElement(By.cssSelector("h3")).getText(), aboutUsPage.chooseUsSectionHeaders[i]);
            Assert.assertEquals(aboutUsPage.chooseUsSectionEachEl.get(i).findElement(By.className("text")).getText(), aboutUsPage.chooseUsSectionDesc[i]);
        }


//        System.out.println(aboutUsPage.chooseUsSectionEachEl.get(0).findElement(By.className("text")).getText());
//        System.out.println(aboutUsPage.chooseUsSectionEachEl.get(0).findElement(By.cssSelector("h3")).getText());
//        Assert.assertEquals(aboutUsPage.chooseUsSectionEachEl.get(0).findElement(By.cssSelector("h3")));

    }
    @Test(testName = "ASTF-25: About Us page: Main content")
    public void testASTF25() {

        Assert.assertEquals(aboutUsPage.pageTitle.findElement(By.cssSelector("h2")).getText(), aboutUsPage.mainHeader);

        aboutUsPage.isDisplayed(aboutUsPage.pageTitle.findElement(By.cssSelector("h2")));
        aboutUsPage.isDisplayed(aboutUsPage.authorInfo.findElement(By.cssSelector("h4")));
        aboutUsPage.isDisplayed(aboutUsPage.authorInfo.findElement(By.className("designation")));
    }
    @Test
    public void testASTF28() {

        aboutUsPage.isDisplayed(aboutUsPage.headerExperts);
        Assert.assertEquals(aboutUsPage.headerExperts.getText(), aboutUsPage.headerExpertsText);

        aboutUsPage.click(aboutUsPage.ourServicesBtn);

        Assert.assertEquals(getDriver().getTitle(), servicesPage.title);
        System.out.println(getDriver().getTitle() + " | " + servicesPage.title);
    }
}