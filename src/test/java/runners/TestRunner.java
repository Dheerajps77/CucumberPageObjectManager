package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/functionalTests", 
		glue = "stepDefinitions", 
		monochrome = true, 
		tags = "@E2ETest", 
		plugin = {
				"html:target/cucumber.html", 
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt",
				"html:target/cucumber-html-report", 
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
