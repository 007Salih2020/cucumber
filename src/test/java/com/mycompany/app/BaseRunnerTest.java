package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                plugin ={"json:target/cucumber.json"}, 
                features = {"resource/***.feature"},
                glue = {"com.mycompany.app.steps" },
                tags= {"@hello", "@regression"}
)


public class BaseRunnerTest {

}
