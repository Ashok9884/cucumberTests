package cucumberTest;



	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Features"
			,glue={"stepsDefinition"}
			,tags={"@Regression"}
			,dryRun=false
			,monochrome=true
			,plugin={"pretty", "html:Reports"}
			)
	public class Runner {	 
	
	
	
}
