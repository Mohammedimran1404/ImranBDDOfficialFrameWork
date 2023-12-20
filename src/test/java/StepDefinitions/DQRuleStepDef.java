package StepDefinitions;

import DriverManagers.ConfigFileManager;
import Pages.DQRulePage;
import Utilities.DriverUtilis;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DQRuleStepDef {

    DQRulePage dqRulePage;
    //DQGLoginpage dqgLoginpage;
    DriverUtilis driverUtilis;

    public DQRuleStepDef(DriverUtilis driverUtilis)
    {
        this.driverUtilis=driverUtilis;
        dqRulePage=this.driverUtilis.getBasePage().getDqRulePage();
    }
    @Given("Launch DQG Application")
    public void launch_dqg_application() {

        String strAppURL= ConfigFileManager.getInstance().getReadConfig().getApplicationURL();
        dqRulePage.loginToDqg(strAppURL);

    }
    @And("Enter the valid Credentials for accessing DQG")
    public void enter_the_valid_credentials_for_accessing_dqg() throws InterruptedException {

        dqRulePage.enterValidCredentials();
    }
    @And("Click on Sign button")
    public void click_on_sign_button() {
        dqRulePage.signin();
    }
    @And("Enter into {string} module")
    public void enter_into_module(String string) {
        dqRulePage.enterIntodqRule(string);
    }
    @And("Create rule by selecting Database")
    public void create_rule_by_selecting_database() {
       dqRulePage.createRule();
    }
    @And("Select Data Source List")
    public void select_data_source_list() {
        dqRulePage.selectSource();
        dqRulePage.selectDatasourcefromList();
    }
    @And("Click on Next button")
    public void click_on_next_button() {
        dqRulePage.nextButton();
    }
    @And("Select table from list")
    public void select_table_from_list() {
       dqRulePage.selectTable();
    }
    @And("Click on Go button")
    public void click_on_go_button() {
        dqRulePage.goButton();

    }
    @When("Click on the Columns Text")
    public void click_on_the_columns_text() {
      dqRulePage.columntext();
    }
    @And("Validate the columns are displayed")
    public void validate_the_columns_are_displayed() {
        dqRulePage.columnsvalidation();
    }
    @And("Select {string} from Column name in Table")
    public void select_from_column_name_in_table(String string) {
        dqRulePage.selectColumns(string);
    }
    @And("Validate select data quality checks is visible")
    public void validate_select_data_quality_checks_is_visible() {
       dqRulePage.qualityChecksValidation();
    }
    @And("Select {string} from Data Quality Checks  and update {string} in text field")
    public void select_from_data_quality_checks_and_update_in_text_field(String string, String string2) {
        dqRulePage.selectqualitychecks(string,string2);
    }
    @And("Validate  Match data type is visible")
    public void validate_match_data_type_is_visible() {
        dqRulePage.matchDatatypevalidation();
    }
    @And("Select {string} from Match Datatype")
    public void select_from_match_datatype(String string) {
       dqRulePage.matchtype(string);
    }
    @And("Click on Add Data Quality Checks button")
    public void click_on_add_data_quality_checks_button() {
        dqRulePage.addDataqualityCheck();
    }
    @And("Click on create DQ rule button")
    public void click_on_create_dq_rule_button() {
        dqRulePage.createDQrule();
    }
    @And("Update {string} in DQ Rule name field")
    public void update_in_dq_rule_name_field(String string) {
        dqRulePage.dqruleName(string);
    }
    @And("Click on Create button")
    public void click_on_create_button() {
      dqRulePage.createDataQualityRule();
    }
    @Then("Validate DQ rule name is updated in the Data Quality module")
    public void validate_dq_rule_name_is_updated_in_the_data_quality_module() {
       dqRulePage.validatingDQRulename();
    }
    @And("Close the DQG Application")
    public void close_the_dqg_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
