package com.juaracoding.ujianketiga.pageobject.utils;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.ujianketiga.pageobject.pages.AddToCart;
import org.openqa.selenium.WebDriver;

public class addToCart {
    public static void main(String[] args){
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        AddToCart addToCart = new AddToCart();
        addToCart.menuAddtocart();

        try {
            Thread.sleep(3000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}