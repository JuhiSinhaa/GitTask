package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\juhi.sinha\\eclipse-workspace\\17oct\\features\\Readniess.feature",
		glue={"stepDefinition"},
		tags = "@gp1",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		)
public class TestRun {
}
