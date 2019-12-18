package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDefinitions {
	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("launch");
	}

	@Given("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("sign up");
	}

	@When("user enters proper data")
	public void user_enters_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("enter data");
	}

	@Then("clicks on submit button for account creation")
	public void clicks_on_submit_button_for_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("submit");
	}

	@Given("registered user clicks on signIn link")
	public void registered_user_clicks_on_signIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("signIn");
	}

	@Then("he provides valid data for login input fields")
	public void he_provides_valid_data_for_login_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("login input fields");
	}

	@Then("clicks on submit button for the login validation")
	public void clicks_on_submit_button_for_the_login_validation() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("submit2");
	}

	@Given("user verifies the flights available")
	public void user_verifies_the_flights_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("verify");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("flight selection");
	}

	@When("user makes the payments")
	public void user_makes_the_payments() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("payment");
	}

	@Then("Tickets are generated")
	public void tickets_are_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("ticket generation");
	}


}
