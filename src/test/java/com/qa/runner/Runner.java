package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author HP
 * 
 * This is cucumber runner class to run feature file and generate report
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.qa.stepdefinations" }, plugin = { "pretty",
		"html:target/cucumber-reports/Cucumber.html" },tags={"@employeeCRUD5TCS"}, monochrome = true)

//json:target/cucumber-reports/Cucumber.json

public class Runner {

}
