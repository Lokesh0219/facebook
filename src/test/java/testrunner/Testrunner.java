package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\Downloads\\eclipse-jee-2022-12-R-win32-x86_64 (1)\\eclipse\\Lokesh Programming\\CucumberBDDframework\\src\\test\\resources\\featurefiles\\Fb.feature" ,
glue= {"stepdefinition"}, monochrome=true)

public class Testrunner {

}
