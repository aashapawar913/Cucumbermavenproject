package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {
	public WebDriver driver;
	By searchTextBox = By.xpath("//input[@type='search']");
	By offerPageLinkText = By.linkText("Top Deals");
	By productname = By.cssSelector("tr td:nth-child(1)");

	public offerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void serachOfferPageItem(String shortname) {
		driver.findElement(searchTextBox).sendKeys(shortname);
	}

	public String getProductName() {
		String productnm = driver.findElement(productname).getText();
		return productnm;
	}

	public void ClickOnTopDealsLink() throws Throwable {
		driver.findElement(offerPageLinkText).click();
	}

}
