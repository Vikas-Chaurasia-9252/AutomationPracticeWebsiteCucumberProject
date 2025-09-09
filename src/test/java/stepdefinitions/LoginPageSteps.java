package stepdefinitions;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import applicationHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	LoginPage obj = new LoginPage(DriverFactory.getDriver());
	String pageTitle;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/loginpagePractise/");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	     pageTitle = obj.getPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Expected Title: "+ string);
	    Assert.assertEquals(pageTitle, string);
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
