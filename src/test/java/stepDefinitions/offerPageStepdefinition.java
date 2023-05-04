package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.offerPage;
import utils.testContextSetup;

public class offerPageStepdefinition {
	testContextSetup testcontextsetup;
	public offerPage offerpage; // =testcontextsetup.pageobjectmanager.getOfferPage();

	public offerPageStepdefinition(testContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		offerpage = testcontextsetup.pageobjectmanager.getOfferPage();
	}

	@Then("^User searched for (.+) shortname in offers page to check if product exists$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exists(String shortname)
			throws Throwable {
		offerpage.ClickOnTopDealsLink();
		Thread.sleep(2000);
		testcontextsetup.genericutils.switchToChildWindow();
		offerpage.serachOfferPageItem(shortname);
		Thread.sleep(2000);
		testcontextsetup.offerpageProductname = offerpage.getProductName();
		System.out.println(testcontextsetup.offerpageProductname);
	}

	@And("^Verify offer page product name matched with Landing page$")
	public void VerifyOfferPageProductMatchedwithlandingpage() throws Throwable {

		Assert.assertEquals(testcontextsetup.landingpageProductname, testcontextsetup.offerpageProductname);

	}

}
