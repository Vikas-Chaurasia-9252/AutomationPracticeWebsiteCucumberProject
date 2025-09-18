package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utilities.Utility;

public class ProductsPage {

     private By allProductHeading = By.className(".title");
     private By productCards=By.xpath("//div[@class='productinfo text-center']/p");
     private By getSuccessMessageText = By.xpath("//p[text()='Your product has been added to cart.']");
     private Utility util ;
     private By continueButton = By.xpath("//button[text()='Continue Shopping']");
     private WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;

    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public boolean checkAllProductTitle(){
        return driver.findElement(allProductHeading).isDisplayed();
    }

    public void addProductToCart(String productTobeAdded){

        List<WebElement> productList = driver.findElements(productCards);

        for(WebElement ele : productList){
            
            if(ele.getText().equalsIgnoreCase(productTobeAdded)){
                driver.findElement(By.xpath("//div[@class='productinfo text-center']/p/following-sibling::a")).click();
                break;
            }
        }
    }

    public String getSuccessMessage(){
        util= new Utility(driver);
        util.waitForElementTobeVisible(getSuccessMessageText);
        return driver.findElement(getSuccessMessageText).getText();
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    
}
