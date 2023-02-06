package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderAlloRegistration {
    private final static String NAME = "Наталія";
    private final static String PHONE = "+380637932476";
    private final static String MAIL = "natalianastych@icloud.com";
    private final static String PASSWORD = "070184";

    @DataProvider
    public static Object[][] randomUserDataRegistration() {
        return new Object[][]{
                {NAME, PHONE, MAIL, PASSWORD}
        };
    }
}
