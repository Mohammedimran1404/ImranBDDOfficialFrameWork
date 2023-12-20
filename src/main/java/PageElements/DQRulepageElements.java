package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DQRulepageElements {


    @FindBy(css="[id*=':r0']") public WebElement logintodqgbutton;
    @FindBy(css="[type='email']")public WebElement email;
    @FindBy(css="#idSIButton9")public WebElement nextbtn;
    @FindBy(css="[type='password']")public WebElement password;
    @FindBy(css="[id*='idSIBut']")public WebElement signinbutton;
    @FindBy(css="[type='submit']")public WebElement yesbutton;
    @FindBy(xpath = "//button[text()='Confirm']")public WebElement confirmbutton;
    @FindBy(css="[class*='MuiTypography-root MuiTypography-body1 MuiListItemText-primary']")public List<WebElement> lstElem;
    @FindBy(xpath ="//button[text()='Create Rule']")public WebElement createrulebutton;
    @FindBy(css="[src*='/static/media/database.0']")public WebElement databasesource;
    @FindBy(css="[type='text']")public WebElement filelist;
    @FindBy(xpath = "//button[text()='Next']")public WebElement nextbutton;
    @FindBy(css="[role='combobox']")public WebElement selecttable;
    @FindBy(xpath = "//button[text()='GO']")public WebElement gobutton;
    @FindBy(css="[class*='MuiTypography-body1 css-1ncylql']")public WebElement columnstext;
    @FindBy(css="[class*='-root css-d5fg4x']")public WebElement columns;
    @FindBy(xpath = "//table[contains(@class,'MuiTable-root css')]/tbody/tr/td[2]")public List<WebElement> listColumns;
    @FindBy(css="[class*='MuiTableCell-root MuiTableCell-body '] [class*='PrivateSwitchBase-input']")public List<WebElement> listColumnCheckboxes;
    @FindBy(css="[class='MuiBox-root css-pqs085']")public WebElement dqchecks;
    @FindBy(xpath ="//*[contains(@class,'selValBody MuiBox-root')] //*[contains(@class,'MuiCheckbox-root MuiCheckbox-colorPrimary')]")public List<WebElement> lstqualitycheckCheckboxes;
    @FindBy(xpath ="//*[contains(@class,'selValBody MuiBox-root')] //*[contains(@class,'MuiTypography-root MuiTypography-body')]")public List<WebElement> lstqualitychecknames;
    @FindBy(css = "[name='value_text']")public WebElement enterText;
    @FindBy(xpath = "//*[text()='Match Datatype']")public WebElement datatypevalidation;
    @FindBy(css="[class*='MuiBox-root css-1ir8goe'] [class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-136foal']") public List<WebElement> lstdatatype;
    @FindBy(xpath = "//*[text()='Add Data Quality Checks']")public WebElement addDataqualitycheckbutton;
    @FindBy(css = "[class*='MuiBox-root css-1ir8goe'] [class*='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary ']") public List<WebElement> lstdatatypecheckboxes;
    @FindBy(css="[class*='MuiGrid-root MuiGrid-item MuiGrid-grid-sm-6 css-1dmuaql'] [class*='MuiButton-containedSizeSmall css-1']")public WebElement createDqruleButton;
    @FindBy(css="[name='rulename']")public WebElement dqrulename;
    @FindBy(xpath = "//button[text()='Create']")public WebElement createDataqualityRule;
    @FindBy(css="[class*='MuiBox-root css-qniue5'] [aria-colindex='3']")public List<WebElement> lstDQRulenameColumn;

}
