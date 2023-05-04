package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
glue="stepDefinitions",monochrome=true , tags="@OffersPage",
plugin= {"pretty","html:target/testReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenerio.txt"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
