package com.movie.demo.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions (

		features = "src/test/resources/features",
		glue = {"com.movie.demo.stepdefinitions"},
		tags = {"@WikiImdb"},
		plugin = {
				"pretty","html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json",
				"rerun:target/cucumber-reports/rerun.txt"
		}

		)
public class TestRunner extends AbstractTestNGCucumberTests{

	

}
