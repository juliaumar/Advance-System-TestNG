package tests;

import base.BaseTest;

import data.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AboutUsPage;

import java.util.ArrayList;
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
    }}