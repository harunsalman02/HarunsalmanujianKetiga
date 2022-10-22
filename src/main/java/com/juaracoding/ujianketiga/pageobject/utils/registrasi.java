package com.juaracoding.ujianketiga.pageobject.utils;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.ujianketiga.pageobject.pages.Registrasi;
import org.openqa.selenium.WebDriver;

;

public class registrasi {
    public static void main(String[] args){
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        Registrasi registrasi = new Registrasi();
        registrasi.registrationFrom("Harun salman" , "harun02juli@gmail.com" , "Harunsalman123");

        try {
            Thread.sleep(3000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}

