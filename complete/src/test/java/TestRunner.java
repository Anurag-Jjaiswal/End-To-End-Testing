import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/TestResources",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class TestRunner {
}
