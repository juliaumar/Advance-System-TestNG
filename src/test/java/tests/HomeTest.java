package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.CommonPage;
import pages.HomePage;



public class HomeTest extends BaseTest implements CommonPage {

    HomePage testPage;


    @BeforeMethod
    public void localSetUp() {
        testPage = new HomePage(getDriver());

    }




}














