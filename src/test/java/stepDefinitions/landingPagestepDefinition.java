//make sure driver is not called in any step definition classes directly only methods should be called.

package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landingPage;
import utils.testContextSetup;

public class landingPagestepDefinition {
	testContextSetup testcontextsetup;
	public landingPage landingpage;

	public landingPagestepDefinition(testContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		landingpage = testcontextsetup.pageobjectmanager.getLandingPage();
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		testcontextsetup.testbase.WebDriverManager(); // to call webdriver method created in testbase class through
		landingpage = testcontextsetup.pageobjectmanager.getLandingPage();	// testcontextsetup class.
	}

	@When("^User search with shortname (.+) and  Extract the actual name from product$")
	public void user_search_with_shortname_and_extract_the_actual_name_from_product(String shortname) throws Throwable {
		landingpage.searchLandingpageItem(shortname);
		Thread.sleep(2000);
		testcontextsetup.landingpageProductname = landingpage.getProductName().split("-")[0].trim();
		System.out.println(testcontextsetup.landingpageProductname);
	}

	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		landingpage.incrementQty(Integer.parseInt(quantity));
		landingpage.clickOnAddtocart();
	}

}
