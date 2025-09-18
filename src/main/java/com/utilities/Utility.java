package com.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

    private WebDriver driver;
    private WebDriverWait wait;

    public Utility(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); 
    }

    public void waitForElementTobeVisible(By ele){

        wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
    }
    
}
