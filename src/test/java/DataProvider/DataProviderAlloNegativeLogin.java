package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderAlloNegativeLogin {
    private final static String LOGIN = "+380000000000";
    private final static String PASSWORD = "070184";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {LOGIN, PASSWORD}
        };
    }
}
