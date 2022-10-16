package com.juaracoding.ujianketiga.pageobject;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.ujianketiga.pageobject.pages.WebTables;
import com.juaracoding.ujianketiga.pageobject.utils.Constants;
import  org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args){

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        WebTables webTables = new WebTables();
        webTables.registrationFrom("Text 1", "Text 2", "text@email.com", "20", "2000", "SQA");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
