package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-TRAINING.PDC3B\\eclipse-NamrataMS\\DemoBDD\\MyFeatures\\Registration.feature",glue= {"stepDefinitions"}, 
tags= {"@UAT"})
public class ShoppingCart {

}
