package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-TRAINING.PDC3B\\eclipse-NamrataMS\\DemoBDD\\MyFeatures\\Login.feature",glue= {"stepDefinitions"}, 
tags= {"@Regression"})
public class Runners {

}
