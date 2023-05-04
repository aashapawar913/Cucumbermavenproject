package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

// make sure no new driver gets open for code where this driver is being called else new chrome would keep open everytime we execute this
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.Timeout;

public class testBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fs);
		String url = prop.getProperty("QAURL");

		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
				// driver=new ChromeDriver(); -- to handle invalid forbidden 403 code also to
				// handle when chrome is not launching jst getting open.
				driver = new ChromeDriver(chromeOptions);
			}
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver", "drivers\\fiefox.exe");
			}
			if (prop.getProperty("browser").equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", "drivers\\ie.exe");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
		return driver;
	}

}
