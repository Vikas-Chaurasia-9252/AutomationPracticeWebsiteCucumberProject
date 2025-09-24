package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Utility;

public class PaymentPage {
     
    private By nameOnCard = By.name("name_on_card");
    private By cardNum = By.name("card_number");
    private By cvc = By.name("cvc");
    private By expiryMonth = By.name("expiry_month");
    private By expiryYear = By.name("expiry_year");
    private By payAndConfirmOrder = By.id("submit");
    private By orderCnfMsg = By.xpath("//p[text()='Congratulations! Your order has been confirmed!']");
     private WebDriver driver;
     private Utility utils;

    public PaymentPage(WebDriver driver){
        this.driver = driver;

    }

    public void enterDetails(String name, String cardNums, String cvcNum, String expiryMonths, String expiryYears){
        driver.findElement(nameOnCard).sendKeys(name);
        driver.findElement(cardNum).sendKeys(cardNums);
        driver.findElement(cvc).sendKeys(cvcNum);
        driver.findElement(expiryMonth).sendKeys(expiryMonths);
        driver.findElement(expiryYear).sendKeys(expiryYears);
    }

    public String clickOnpayButton(){
        WebElement paybtn = driver.findElement(payAndConfirmOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",paybtn);
        paybtn.click();
        utils = new Utility(driver);
        utils.waitForElementTobeVisible(orderCnfMsg);
        return driver.findElement(orderCnfMsg).getText();


    }

    
}
