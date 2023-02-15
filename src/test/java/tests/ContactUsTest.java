package tests;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactUsPage;


public class ContactUsTest extends BaseTest {
    ContactUsPage contactUsPage;

    @BeforeMethod
    public void localSetUp() {
        contactUsPage = new ContactUsPage(getDriver());
        contactUsPage.contactLink.click();
    }
    @Test(testName = "ASTF-35: Contact Us page: Map")
    public void testASTF35() {
        contactUsPage.isDisplayed(contactUsPage.map);
    }
}
