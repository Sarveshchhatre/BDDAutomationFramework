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
@CucumberOptions(features = "src/test/resources/features", glue = { "com.qa.stepdefinations" }, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }, monochrome = true)


public class Runner {

}
