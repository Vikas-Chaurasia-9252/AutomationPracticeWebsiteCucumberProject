package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductPageSteps {
    WebDriver driver;
    LoginPage loginObj;
    ProductsPage obj;

    @Given("I login with valid credentials {string} and {string}")
public void i_login_with_valid_credentials_and(String email, String pwd) {
    System.out.println("User is trying to login");
    driver=DriverFactory.getDriver();
    loginObj = new LoginPage(driver);
    obj = new ProductsPage(driver);
    loginObj.clickLoginBtn();
    loginObj.enterEmail(email);
    loginObj.enterPassword(pwd);
    loginObj.LogIn();

}

@When("I navigate to Products page")
public void i_navigate_to_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User is navigating to Product page");
   obj.navigateToProductPage();
   String actualPageTitle = obj.getPageTitle();
   System.out.println("ActualPageTile="+actualPageTitle);
   Assert.assertEquals(actualPageTitle, "Automation Exercise - All Products");


}
@When("I add the product with description {string} to the cart")
public void i_add_the_product_with_description_to_the_cart(String productToBeAdded) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User is adding the product to the cart "+ productToBeAdded + " is the product");
    obj.addProductToCart(productToBeAdded);
}
@Then("I should see a success message {string}")
public void i_should_see_a_success_message(String expectedSuccessMsg) {
    // Write code here that turns the phrase above into concrete actions
    String actualSuccessMsg = obj.getSuccessMessage();
    System.out.println("actualSuccessMsg="+actualSuccessMsg);
    Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
}
@Then("I click on continue shopping button")
public void i_click_on_continue_shopping_button() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User is clicking to continue button");
    obj.clickContinueButton();
    Assert.assertTrue(obj.checkAllProductTitle());
}
}
