package cucumberOptionsPackage;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features",
glue="StepDefinition",
tags = "@tag, @smoke",
monochrome = true,
//strict = true,
dryRun =true
)
public class TestRunner {

	
}
