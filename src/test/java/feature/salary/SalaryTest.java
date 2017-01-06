package feature.salary;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/feature/book",
@CucumberOptions(features = "classpath:.",
tags = "@Salary", glue = "feature.salary", monochrome = true, dryRun = false)
public class SalaryTest {
 
}
