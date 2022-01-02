package testRuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {".\\src\\test\\java\\sample.feature"},// feature file
		tags=" @smoketest or @regressiontest",
		glue= {"stepDefination_sample"}, //package add
		dryRun = true,// steps 
		monochrome = true,
		plugin = {"pretty"}// read
		)


public class TestRunnerSample extends AbstractTestNGCucumberTests{
	
}