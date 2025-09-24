package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.CartPage;
import com.pages.PaymentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {

    WebDriver driver;
    CartPage cartobj;
    PaymentPage paymentobj;
    String confirmMsg;

    @Given("I click on Proceed to checkout button")
public void i_click_on_proceed_to_checkout_button() {
    System.out.println("User is clicking on checkout button");
    driver = DriverFactory.getDriver();
    cartobj = new CartPage(driver);
    paymentobj = new PaymentPage(driver);

    cartobj.clickOnProceedToCheckout();
   
}

@When("I enter payment details with card name {string}, card number {string}, cvc {string}, expiry {string}, year {string}")
public void i_enter_payment_details_with_card_details(String cardName, String cardNumber, String cvc, String expiry, String year) {
    System.out.println("User is entering details of card");
    paymentobj.enterDetails(cardName, cardNumber, cvc, expiry, year);
}

@When("I click on Pay and Confirm Order")
public void i_click_on() {
    System.out.println("User got the confirmation msg");
   confirmMsg = paymentobj.clickOnpayButton();
}

@Then("I should see a payment success message {string}")
public void i_should_see_a_payment_success_message(String successMessage) {
    System.out.println("Final confirmation message validation");
    Assert.assertEquals(confirmMsg,successMessage);
}

    
}
