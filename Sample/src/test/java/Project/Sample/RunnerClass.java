package Project.Sample;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Project/Sample/Demo.feature",
		format = { "pretty", "html:target/Reports" })
public class RunnerClass {

}