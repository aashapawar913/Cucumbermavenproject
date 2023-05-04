package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	public WebDriver driver;
	
	public genericUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void switchToChildWindow() {
		
	Set<String> s1 = driver.getWindowHandles();
	Iterator<String> i1 = s1.iterator();
	String parentWindow = i1.next();
	String childwindow = i1.next();
	driver.switchTo().window(childwindow);
}
}

// Now to access method of this class in stepdefinition this class should be called in dependency injection call which is testcontextsetup call .