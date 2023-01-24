package data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "nav buttons")
    public Object[] data() {
        Object[] navBtns = new String[]{"HOME", "ABOUT US ", "SERVICES","CLIENTS", "JOIN US", "CONTACT US",};

        return navBtns;
    }
    @DataProvider(name = "navLinks")

    public Object[][] dataValid() {
        Object[][] navLinks = new Object[1][6];
        navLinks[0][0] = "HOME";
        navLinks[0][1] = "ABOUT US";
        navLinks[0][2]= "SERVICES";
        navLinks[0][3]= "CLIENTS";
        navLinks[0][4]= "JOIN US";
        navLinks[0][5]= "CONTACT US";
        return navLinks;
    }
}






































  /*  @DataProvider(name = "roles")
    public Object[] data2(){
        Object[] roles = new String[] {"Mentor", "Student", "Instructor"};
        return roles;
    }*/

