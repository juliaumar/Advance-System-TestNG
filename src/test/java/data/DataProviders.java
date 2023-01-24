package data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "nav buttons")
    public Object[] data() {
        Object[] navBtns = new String[]{"HOME", "ABOUT US ", "SERVICES", "JOIN US", "CONTACT US",};

        return navBtns;
    }
}






































  /*  @DataProvider(name = "roles")
    public Object[] data2(){
        Object[] roles = new String[] {"Mentor", "Student", "Instructor"};
        return roles;
    }*/

