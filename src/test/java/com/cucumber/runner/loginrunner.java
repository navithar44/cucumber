package com.cucumber.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/loginfeature.feature",
				 glue = {"com/cucumber/steps"},
				 plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
						 "json:target/cucumber-reports/cucumber.json"},
				 tags="@test_login_logout"  
				 )

public class loginrunner {

}
