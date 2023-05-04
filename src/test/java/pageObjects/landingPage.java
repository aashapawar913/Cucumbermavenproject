package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;

	By searchTextBox = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By incrementButton = By.xpath("//a[@class='increment']");
	By AddtoCartButton= By.cssSelector(".product-action button");

	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchLandingpageItem(String shortname) {
		driver.findElement(searchTextBox).sendKeys(shortname);
	}

	public String getProductName() {
		String productname= driver.findElement(productName).getText();
		return productname;
	}
	
	public void incrementQty(int qty) {
		int i=qty-1;
		while(i>0) {
			driver.findElement(incrementButton).click();
			i--;
		}				
	}	
	public void clickOnAddtocart() {
		driver.findElement(AddtoCartButton).click();
	}
	
	
}