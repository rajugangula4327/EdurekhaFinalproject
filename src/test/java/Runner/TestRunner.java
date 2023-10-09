package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/login.feature"},glue = {"Step.definations"},plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty"}, tags = "@Sanity")
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
