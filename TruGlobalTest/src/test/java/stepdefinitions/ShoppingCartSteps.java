package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;
import pages.SearchResultsPage;
import pages.ShoppingCartPage;
import tests.BaseTest;

public class ShoppingCartSteps extends BaseTest {
	private SearchResultsPage searchResultsPage;
	private ProductDetailsPage productDetailsPage;
	private ShoppingCartPage shoppingCartPage;
	private BaseTest baseTest;

	@Given("I am on the search results page")
	public void iAmOnTheSearchResultsPage() {
		baseTest.setUp();
		// Implement logic to navigate to the search results page
		searchResultsPage = new SearchResultsPage(driver);
		searchResultsPage.entertextinSerachField();
		searchResultsPage.clickOniphone();
		
	}
/*
	@When("User searches for {string}")
	public void user_searches_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User selects the first result")
	public void user_selects_the_first_result() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User goes to the product details page")
	public void user_goes_to_the_product_details_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User stores the price in a variable")
	public void user_stores_the_price_in_a_variable() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Product should be added to the cart successfully")
	public void product_should_be_added_to_the_cart_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
*/
}
