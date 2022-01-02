package testRuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/**
 * TestRunner
 * @author Joga Rao
 * Description
 */
@CucumberOptions(
		features= {".\\src\\test\\java\\org.feature"},// feature file
		glue= {"stepDefination_org"}, //package add
		dryRun = true,// steps available
		monochrome = true,//  the console output for the Cucumber test are much more readable.
		plugin = {"pretty"}// read script prepare
		)


public class TestRuner extends AbstractTestNGCucumberTests{
	
}