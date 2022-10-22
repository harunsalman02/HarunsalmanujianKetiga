package com.juaracoding.ujianketiga.pageobject.pages;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    private WebDriver driver;

    public AddToCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "AddTocart")
    WebElement AddTocart;

    @FindBy(id = "Viewcart")
    WebElement Viewcard;

    @FindBy(xpath = "")
    WebElement menuAddtocart;

    @FindBy(xpath = "//a[@class='noo-thumbnail-product hover-device']/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]")
    WebElement txtAddtocart;

    @FindBy(xpath = "//a[@class='button wc-forward']/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement buttonwcforward;

    @FindBy(xpath = "//a[@class='button wc-forward']/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[2]")
    WebElement txtViewcard;

    public void menuAddtocart() {
        menuAddtocart.click();
    }

    public String getTxtAddtocart() {
        return txtAddtocart.getText();
    }
}