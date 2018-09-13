package sample;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/sample/ReportSample.feature",
		plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml"},
		monochrome = true
		)

public class RunnerClass {

}