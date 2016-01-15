package com.org.carpool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/features",glue="com.org.carpool", tags="~@goyalTag", format={"pretty","html:target/cucumber","json:target_json/cucumber.json","junit:target_junit/cucumber.xml"})
@RunWith(Cucumber.class)
public class TestDisplayRide {

}
