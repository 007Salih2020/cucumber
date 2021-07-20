package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"json:target/cucumber.json"}, tags= {"@hello", "SPEL-1"})

public class BaseRunnerTest {

}
