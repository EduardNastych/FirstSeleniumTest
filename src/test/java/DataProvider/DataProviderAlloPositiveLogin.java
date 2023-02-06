package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderAlloPositiveLogin {
    private final static String LOGIN = "+380637932476";
    private final static String PASSWORD = "070184";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {LOGIN, PASSWORD}
        };
    }
}
