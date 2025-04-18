package TestExecutor;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "StepDefinitions",
        tags="",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumber-json-report.json",
                "timeline:target/test-output-thread/",
                "junit:target/cucumber-reports/cucumber-junit-report.xml"
        }
)
public class TestRunnerRerun  extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
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
