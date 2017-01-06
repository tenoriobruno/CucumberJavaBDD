package feature.book;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/feature/book",
@CucumberOptions(features = "classpath:.",
tags = "@Book", glue = "feature.book", monochrome = true, dryRun = false)
public class BookSearchTest {
}