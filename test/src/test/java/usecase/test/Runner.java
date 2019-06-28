package usecase.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome=true,plugin={"pretty","junit:Register.xml"})
public class Runner 
{

}
