package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.testContextSetup;

public class hooks {
	public testContextSetup testcontextsetup;
	public hooks(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;		
	}
	
	@After
	public void CloseallBrosers() throws IOException {
		testcontextsetup.testbase.WebDriverManager().quit();
	}

}
