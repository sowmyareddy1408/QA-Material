package todoapp;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"stepdefinition"}
		,monochrome = false
		,format = {"pretty", "html:target/Destination"} 
		)

public class RunToDoApp {

}
