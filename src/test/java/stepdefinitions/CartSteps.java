package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    WebDriver driver;
    CartPage cartobj;

    @When("I click on Cart link")
    public void i_click_on_cart_link() {
        System.out.println("User is clicking on cart link");
    driver=DriverFactory.getDriver();
    cartobj = new CartPage(driver);
    cartobj.goToCartPage();

}

@Then("I should see the product added with description {string} added")
public void i_should_see_the_product_added_with_description_added(String productDescription) {
    System.out.println("Checking if the same product is added to the cart");
    Assert.assertTrue(cartobj.isProductAdded(productDescription));
    
}


}
