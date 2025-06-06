package TestExecutor;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags="@DataQualityRule",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumber-json-report.json",
                "timeline:target/test-output-thread/",
                "junit:target/cucumber-reports/cucumber-junit-report.xml",
                "html:target/cucumber-reports/cucumber-pretty",
                "rerun:target/rerun.txt"}

)
// to run the features using maven use this command
// mvn clean test -Ddataproviderthreadcount=3 -Dcucumber.filter.tags="@tagname"
public class TestRunner  extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Execution Started");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Test Execution Started");
    }

}


