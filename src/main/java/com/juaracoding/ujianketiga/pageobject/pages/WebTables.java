package com.juaracoding.ujianketiga.pageobject.pages;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables {
    private WebDriver driver;

    public WebTables() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement btnAdd;

    @FindBy(id = "USERNAMEOREMAILADDRESS")
    WebElement  USERNAMEOREMAILADDRESS;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(id = "Login")
    WebElement Login;

    @FindBy(id = "USERNAME ")
    WebElement  USERNAME ;

    @FindBy(id = "EMAILADDRESS")
    WebElement EMAILADDRESS;

    @FindBy(id = "PASSWORD")
    WebElement  PASSWORD;


    @FindBy(id = "Register")
    WebElement Register;


    //Page Object
    public void registrationFrom(String USERNAMEOREMAILADDRESS, String Password, String USERNAME, String EMAILADDRESS, String PASSWORD){
        btnAdd.click();
        this.USERNAMEOREMAILADDRESS.sendKeys(USERNAMEOREMAILADDRESS);
        this.Password.sendKeys(Password);
        this.USERNAME.sendKeys(USERNAME);
        this.EMAILADDRESS.sendKeys(EMAILADDRESS);
        this.PASSWORD.sendKeys(PASSWORD);
        Login.click();
        Register.click();
    }

    public void registrationForm(String s, String s1, String s2, String s3, String s4, String s5) {
    }
}