package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:featurefile/FacebookLogin.feature",
                glue = {"classpath:com.cucumber.framework.stepdefinition"})
public class FacebookLoginFeatureRunner extends AbstractTestNGCucumberTests {

}
