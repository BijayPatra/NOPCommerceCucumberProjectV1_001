package StepRunner;
//Run with junit
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={".//Features/Login.feature"},
				glue={"stepDefinations"},
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","html:test-output"})
public class TestRunner{

}
