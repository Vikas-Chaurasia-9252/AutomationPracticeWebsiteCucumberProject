package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    WebDriver driver;
    HomePage obj;

     @Given("I open the application")
    public void i_open_the_application() {
        driver=DriverFactory.getDriver();
        obj=new HomePage(driver);
        System.out.println("User is opening the URL in browser");
        driver.get("https://automationexercise.com/");

    }

    @Then("I should see the logo displayed")
    public void i_should_see_the_logo_displayed() {
         System.out.println("User is verifying website logo");
        Assert.assertTrue(obj.checkWebsiteLogo());
    }

    @Then("I should see the {string} menu highlighted")
    public void i_should_see_the_menu_highlighted(String expectedSTR) {
        System.out.println("User is verifying Home Link");
        String actualStr = obj.checkHomePageLink();
        Assert.assertEquals(expectedSTR, actualStr);
    }

    @Then("I should see Products, Cart links")
    public void i_should_see_links() {
        System.out.println("User is verifying Product and Cart Link");
        Assert.assertTrue(obj.checkProductsPageLink());
        Assert.assertTrue(obj.checkCartsPageLink());

    }


    
}
