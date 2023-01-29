package data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "quickLinks")
    public static Object[][] quickLinks(){
        Object[][] data = new Object[5][1];
        data[0][0] = "Home";
        data[1][0] = "About Us";
        data[2][0] = "Services";
        data[3][0] = "Clients";
        data[4][0] = "Contact Us";

        return data;
    }
}
