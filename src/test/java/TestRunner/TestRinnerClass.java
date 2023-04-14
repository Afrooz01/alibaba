package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/resources/java/features"},
plugin = {"json:target/cucumber.json"},
glue = "stepdef", tags = {"@Alibaba"})

public class TestRinnerClass extends AbstractTestNGCucumberTests {

}
