package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private By WebsiteLogo = By.xpath("//img[@alt='Website for automation practice']");
    private By ProductsPageLink = By.xpath("//a[text()=' Products']");
    private By CartsPageLink = By.xpath("//a[text()=' Cart']");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public boolean checkProductsPageLink(){

        return driver.findElement(ProductsPageLink).isDisplayed();
    }

    public boolean checkCartsPageLink(){

        return driver.findElement(CartsPageLink).isDisplayed();
    }

     public boolean checkWebsiteLogo(){

        return driver.findElement(WebsiteLogo).isDisplayed();
    }



}
