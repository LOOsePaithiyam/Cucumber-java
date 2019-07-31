package prjct;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
 import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
 @CucumberOptions(features="src/test/resources/featurefolder/scenario3.feature",
   //glue="sample")
   //plugin="html.target\\htmlreport")
 //plugin="json.target\\jsonreport.json")
 plugin="junit:target\\xmlreport.xml")
 


public class Runnerlav {

}
