package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\juhi.sinha\\eclipse-workspace\\17oct\\features",
		glue={"stepDefinition"},
//		tags = "@DemoWebShop",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		)
public class TestRun {
}
