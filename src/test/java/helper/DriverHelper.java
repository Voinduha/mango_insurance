package helper;

import com.codeborne.selenide.Configuration;

public class DriverHelper {
    public static void configureDriver() {
        Configuration.baseUrl = "https://mango.rocks";
    }
}
