package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {

	public landingPage landingpage;
	public offerPage offerpage;
	public checkOutPage checkoutpage;
	public WebDriver driver;

	public pageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public checkOutPage getcheckOutPage() {
		return checkoutpage = new checkOutPage(driver);
	}
	
	public landingPage getLandingPage() {
		return landingpage = new landingPage(driver);
	}

	public offerPage getOfferPage() {
		return offerpage = new offerPage(driver);
	}
}
