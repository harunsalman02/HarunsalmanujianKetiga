package com.juaracoding.ujianketiga.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Registerdanlogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.demoqa.com/my-account/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        //Find elements using tag name
        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
        if (allInputElements.size()!=0)
        {
            System.out.println(allInputElements.size() + "Elements found by TaqName as input\n");

            for (WebElement inputElement : allInputElements)
            {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
        }

        //find elements using tag name
        List<WebElement> allTextAreaElements = driver.findElements(By.tagName("textarea"));
        //Find elements using tag name
        List<WebElement> allTextAreaE = driver.findElements(By.tagName("textarea"));

        if (allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + "Elements found by TextArea as input\n");

            for (WebElement textAreaElement : allTextAreaElements)
            {
                System.out.println(textAreaElement.getAttribute("placeholder"));
            }
        }

        List<WebElement> allMenuElements = driver.findElements(By.xpath("//*[contains(@id, 'item')]"));
        for (WebElement menuElements : allMenuElements) {
            System.out.println(menuElements.getText());
        }

        //Click Menu Radio Button
        allMenuElements.get(2).click();
        System.out.println("Menu Radio Button Clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}