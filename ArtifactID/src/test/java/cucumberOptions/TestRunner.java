package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = "stepDefinition",tags="@SmokeTest")
public class TestRunner {

}
