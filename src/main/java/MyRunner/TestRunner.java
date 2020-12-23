package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "F:\\Selenium Training\\Cucmber\\CCMProject\\CucumberSeleniumFramework\\src\\main\\java\\Features\\Costmap.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-output","json:json-outpt/ccbr.json","junit:junit/ccbr-junit.xml"},
			monochrome=true,
			strict=true,
			dryRun=false
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

