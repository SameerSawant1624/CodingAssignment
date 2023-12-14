package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserRegistrationPage;
import tests.BaseTest;

public class UserRegistrationSteps extends BaseTest {
    private UserRegistrationPage userRegistrationPage;

    @Given("User is on the Amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        
    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects {string}")
    public void user_selects(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills in the registration form")
    public void user_fills_in_the_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
