package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources/features", //pathod features folder
        glue="stepdefinitions", //path of the step definitions folder
        tags= "@db_customer_ssn",
        dryRun = false
)

public class Runner {
/*
Runner class is used to run the feature files
@RunWith : makes this class runnable
@CucumberOptions:
        1. feature: path of the features folder
        2. glue: path pf the step definitions folder

 */
}
