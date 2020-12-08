package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Fature",
glue="com.stepdef"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
