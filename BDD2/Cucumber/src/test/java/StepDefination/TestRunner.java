package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefination"},plugin=
{"pretty","json:target/cucumber-Reports/report.json"} ,monochrome=true)
public class TestRunner {

}
