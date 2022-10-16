package com.juaracoding.ujianketiga.pageobject;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.ujianketiga.pageobject.pages.WebTables;
import com.juaracoding.ujianketiga.pageobject.utils.Constants;
import  org.openqa.selenium.WebDriver;

public class logindanregistrasi {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        WebTables webTables = new WebTables();
        webTables.registrationFrom("Harunsalman", "harunsalman123", "harunsalman", "harunsalman@gmail.com", "harunsalman123");

        try {
            Thread.sleep(3000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
