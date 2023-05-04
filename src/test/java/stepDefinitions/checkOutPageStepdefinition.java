package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.checkOutPage;
import pageObjects.offerPage;
import utils.testContextSetup;

public class checkOutPageStepdefinition {
	testContextSetup testcontextsetup;
	public checkOutPage checkoutpage; // =testcontextsetup.pageobjectmanager.getOfferPage();

	public checkOutPageStepdefinition(testContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		checkoutpage=testcontextsetup.pageobjectmanager.getcheckOutPage();
		
	}

	@Then("User proceeds to checkout and validate the name of item in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_name_of_item_in_checkout_page() throws InterruptedException {
		checkoutpage.checkOutItems();	
		testcontextsetup.checkOutPageProductname=checkoutpage.getproductname().split("-")[0].trim();
		
	}
	@Then("Verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
		Assert.assertTrue(checkoutpage.VerifyPromoBtn());
		Assert.assertTrue(checkoutpage.VerifyPlaceOrder());
		
}}
