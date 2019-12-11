package runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



//@RunWith(Cucumber)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\resources\\features",
glue="stepdefs",
plugin= {"pretty","json:target/cucumber.json"})
public class TestRunner {

}
