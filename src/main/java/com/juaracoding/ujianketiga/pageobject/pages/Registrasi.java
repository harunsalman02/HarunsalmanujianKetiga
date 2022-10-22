package com.juaracoding.ujianketiga.pageobject.pages;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrasi {

    private WebDriver driver;

    public Registrasi(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "MYACCOUNT")
    WebElement btnRegister;

    @FindBy(id = "USERNAME")
    WebElement USERNAME;

    @FindBy(id = "EMAIL ADDRESS")
    WebElement EMAILADDRESS;

    @FindBy(id = "PASSWORD ")
    WebElement PASSWORD;

    @FindBy(id = "sUbmit")
    WebElement submit;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement menuAccount;
    @FindBy(xpath = "a[href='https://shop.demoqa.com/my-account/']")
    WebElement txtRegistrasi;

    @FindBy(xpath = "//input[@id='reg_username']/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[1]/input[1]")
    WebElement menuRegisterasi;

    @FindBy(xpath = "//input[@id='reg_email']/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[2]/input[1]")
    WebElement SelectRegistrasi;

    @FindBy(xpath = "//input[@id='reg_password']/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/span[1]/input[1]")
    WebElement Password;

    @FindBy(xpath = "//button[@name='register']")
    WebElement btnSearch;


    public void MenuRegisterasi(){menuRegisterasi.click();}

    public String getTxtRegistrasi(){return txtRegistrasi.getText();}

    public void setMenuRegisterasi(){
        SelectRegistrasi.sendKeys("L");
        btnSearch.click();
    }

    public String getTxtregistrasi(){
        return txtRegistrasi.getText();
    }


    //Page Object
    public void registrationFrom(String USERNAME, String EMAILADDRESS, String PASSWORD) {
        btnRegister.click();
        this.USERNAME.sendKeys(USERNAME);
        this.EMAILADDRESS.sendKeys(EMAILADDRESS);
        this.PASSWORD.sendKeys(PASSWORD);
        submit.click();
    }
}
