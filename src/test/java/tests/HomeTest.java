package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.CommonPage;
import pages.HomePage;



public class HomeTest extends BaseTest  {

    HomePage homePage;


    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());


    }




}














