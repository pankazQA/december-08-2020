package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Fature/DropDown.feature",
glue="com.stepdef",
tags="@DropDown"
		)
public class DdTestRunner extends AbstractTestNGCucumberTests {

}
