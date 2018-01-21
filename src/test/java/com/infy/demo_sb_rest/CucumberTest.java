package com.infy.demo_sb_rest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",plugin="json:target/cucumber-report.json")
public class CucumberTest {

}
