package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"json:target/cucumber.json"}, tags= {"hello","@SPEL-1"})
   //   strict = true,
   //   plugin ={"json:target/cucumber.json"},
    //  features= {"src/test/resources/com/mycompany/app/"},
     // glue = { "com.mycompany.app.steps" }
       //  plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}


public class BaseRunnerTest {

}
