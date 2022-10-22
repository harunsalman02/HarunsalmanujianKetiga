package com.juaracoding.ujianketiga.pageobject.pages;

import com.juaracoding.ujianketiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {
    private Login driver;

    public Login() {
        this.driver = (Login) DriverSingleton.getDriver();
        PageFactory.initElements((WebDriver) driver, this);
    }

    @FindBy(id = "USERNAMEOREMAILADDRESS")
    WebElement USERNAMEOREMAILADDRESS;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement btnLogin;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    WebElement txtEmployeeInformation;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    WebElement txtInvalidCredentials;

    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//span[1]")
    WebElement txtRequired;
    public void Login(String username, String password){
        this.USERNAMEOREMAILADDRESS.sendKeys(username);
        this.Password.sendKeys(password);
        btnLogin.click();
    }

    public String getTxtEmployeeInformation(){

        return txtEmployeeInformation.getText();
    }
    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

    public String getTxtRequired(){
        return txtRequired.getText();
    }

}