package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features//Dashboard.feature",
        glue= "StepsDefinitions",
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)

public class TestRunner {

}
