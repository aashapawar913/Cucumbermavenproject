package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenerio.txt", 
glue="stepDefinitions",monochrome=true ,
plugin= {"pretty","html:target/testReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		})

public class FailedTestRunner extends AbstractTestNGCucumberTests{

}

