package prjctPac1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefolder/Scenario2.feature",
plugin="junit:target\\xmlreport.xml")
public class RunnerlavClass {

}
