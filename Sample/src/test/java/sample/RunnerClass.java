package sample;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/sample/Demo.feature",
		format = { "pretty", "html:target/cucumber-reports" } 
		)

public class RunnerClass {

}