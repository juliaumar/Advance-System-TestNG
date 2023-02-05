package data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "quickLinks")
    public static Object[][] quickLinks() {
        Object[][] data = new Object[6][2];
        data[0][0] = "Home";
        data[0][1] = "Advance Systems - Home";

        data[1][0] = "About Us";
        data[1][1] = "Advance Systems - About Us";

        data[2][0] = "Services";
        data[2][1] = "Advance Systems - Services";

        data[3][0] = "Clients";
        data[3][1] = "Advance Systems - Clients";

        data[4][0] = "Contact Us";
        data[4][1] = "Advance Systems - Contact Us";

        data[5][0] = "Join Us";
        data[5][1] = "Advance Systems - Join Us";

        return data;
    }

}