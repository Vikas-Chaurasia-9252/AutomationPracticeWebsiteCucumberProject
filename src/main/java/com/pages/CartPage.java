package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

public class CartPage {
      
      private By CartLink = By.xpath("//a[text()=' Cart']");
      private By ProductCheck = By.xpath("//table[@class='table table-condensed']/tbody/tr/td[2]/h4");
      private By proceedBtn = By.xpath("//a[text()='Proceed To Checkout']");
      private By placeOrder = By.xpath("//a[text()='Place Order']");
      private By waitForCartPage = By.xpath("//li[@class='active']");
      private WebDriver driver;
      private Utility utils;

    public CartPage(WebDriver driver){
        this.driver = driver;
         utils = new Utility(driver);

    }

    public void goToCartPage(){
        driver.findElement(CartLink).click();
        utils.waitForElementTobeVisible(waitForCartPage);
        
    }

    public boolean isProductAdded(String ExpectedProductAdded){
        String ActualProductAdded = driver.findElement(ProductCheck).getText();

        return ActualProductAdded.equalsIgnoreCase(ExpectedProductAdded);

    }

    public void clickOnProceedToCheckout(){
        driver.findElement(proceedBtn).click();
        utils.waitForElementTobeVisible(placeOrder);
        driver.findElement(placeOrder).click();

    }

    


}
