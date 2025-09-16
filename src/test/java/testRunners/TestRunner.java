package testRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/com/features",  // path to your .feature file
    glue = {"stepdefinitions" , "applicationHooks"},                  // package where step defs will be
    plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    dryRun = false
)
public class TestRunner  {

}
