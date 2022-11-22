package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//features = "src/test/javaFeatures"
features = "features"
,glue= {"seleniumgluecode"}
)

public class Testrunner {

}
