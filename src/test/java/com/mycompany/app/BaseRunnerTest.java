package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin ={"json:target/cucumber.json"}
        // features= {"src/test/resources/com/mycompany/app/"},
        // glue = {"com.mycompany.app.steps"}
            )

public class BaseRunnerTest {

}
