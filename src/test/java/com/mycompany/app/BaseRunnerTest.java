package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                plugin ={"json:***/cucumber.json"}, 
                features = {"resource/***.feature"},
                glue = {},
                tags= {"@hello", "@regression"}
)


public class BaseRunnerTest {

}
