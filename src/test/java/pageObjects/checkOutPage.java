package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOutPage {
	By productname = By.xpath("//p[@class='product-name']");
	By productQuantity = By.xpath("//p[@class='quantity']");
	By PromoCodeTextbox = By.xpath("//input[placeholder='Enter promo code']");
	By PromoApplybutton = By.className("promoBtn");
	By Placeorder = By.xpath("//button[contains(text(),'Place Order')]");
	By CartBag = By.xpath("//img[@alt='Cart']");
	By ProceedtocheckOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

	public WebDriver driver;

	public checkOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getproductname() {
		String Productname = driver.findElement(productname).getText();
		return Productname;
	}

	public String getproductQuantity() {
		String ProductQty = driver.findElement(productQuantity).getText();
		return ProductQty;
	}

	public boolean VerifyPromoBtn() {

		return driver.findElement(PromoApplybutton).isDisplayed();
	}

	public void EnterPromoCodeandClickOnApply(String promo) {

		driver.findElement(PromoCodeTextbox).sendKeys(promo);
		driver.findElement(PromoApplybutton).click();
	}

	public boolean VerifyPlaceOrder() {
		return driver.findElement(Placeorder).isDisplayed();

	}

	public void ClickonPlaceOrder() {
		driver.findElement(Placeorder).click();

	}
	public void checkOutItems() {
		driver.findElement(CartBag).click();
		driver.findElement(ProceedtocheckOutButton).click();
	}
	
	

}
