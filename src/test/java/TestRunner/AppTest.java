package TestRunner;

import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"FeatureFile/ERPCucumber.feature"},
glue= {"StepDefenition"},tags="@customers",plugin= {"pretty","html:target/report/cucumber.html"}
)

public class AppTest extends AbstractTestNGCucumberTests {
	

}
