package com.juaracoding.ujianketiga.pageobject.utils;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.ujianketiga.pageobject.pages.Login;
import org.openqa.selenium.WebDriver;
public class login {
        public static void main(String[] args) {

            DriverSingleton.getInstance(Constants.CHROME);
            WebDriver driver = DriverSingleton.getDriver();
            driver.get(Constants.URL);

            Login login = new Login();
                    login.Login("HARUN SALMAN" , "Harun123");

            try {
                Thread.sleep(3000000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.quit();

        }
    }