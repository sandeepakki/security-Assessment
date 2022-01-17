package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
				features=".//FeatureFiles/ResourceCRUD.feature",
				glue="StepDefinition",
				dryRun =false,
	 tags ="@smoke",
						plugin = { "pretty", "json:target/cucumber/report.json",
								 "html:target/cucumber/report.html"},
				monochrome=true
		      )

public class TestRun {

}
