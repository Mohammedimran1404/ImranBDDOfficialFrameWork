package Pages;

import PageElements.DQRulepageElements;
import Utilities.ReusableUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class DQRulePage extends DQRulepageElements {
    private final WebDriver webDriver;

    private ReusableUtils reusableUtils;

    public DQRulePage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        reusableUtils=new ReusableUtils(webDriver);
        PageFactory.initElements(webDriver,this);
    }



//    String RuleName;
    public void enterIntodqRule(String strName)
    {
        try {
            Thread.sleep(4000);

        } catch (Exception e) {
            // TODO: handle exception
        }
        for(int i=0;i<lstElem.size();i++) {
            if(lstElem.get(i).getText().equals(strName)) {
                lstElem.get(i).click();
            }
        }


    }
    public void createRule()
    {
        createrulebutton.click();

    }

    public void selectSource()
    {

        reusableUtils.waitUtillElementIsVisible(databasesource);
        databasesource.click();

    }

    public void selectDatasourcefromList()
    {
        reusableUtils.clickElement(filelist);
        reusableUtils.waitUtillElementIsVisible(filelist);
        reusableUtils.downKey();
        reusableUtils.downKey();


    }

    public void nextButton()
    {
        reusableUtils.waitUtillElementIsVisible(nextbutton);
        reusableUtils.clickElement(nextbutton);

    }

    public void selectTable()
    {
       reusableUtils.shortWait();
       reusableUtils.clickElement(selecttable);
       reusableUtils.downKey();

    }

    public void goButton()
    {
       reusableUtils.clickElement(gobutton);
    }

    public void columntext()
    {
        reusableUtils.shortWait();
        reusableUtils.clickElement(columnstext);

    }

    public void columnsvalidation()
    {
        reusableUtils.isElementDisplayed(columns);

    }

    public void selectColumns(String column)
    {
      reusableUtils.waitUtillElementIsVisible(listColumns.get(0));
        reusableUtils.shortWait();
        for(int i=0;i<listColumns.size();i++)
        {
            if(listColumns.get(i).getText().equalsIgnoreCase(column))
            {
                listColumnCheckboxes.get(i).click();
            }
        }

        reusableUtils.clickElement(columnstext);


    }
    public void qualityChecksValidation()
    {
        reusableUtils.isElementDisplayed(dqchecks);


    }

    public void selectqualitychecks(String qualitycheckValues, String Value)
    {
        reusableUtils.waitUtillElementIsVisible(lstqualitychecknames.get(0));
       reusableUtils.scrollToElement(lstqualitychecknames.get(0));
       reusableUtils.shortWait();
        for(int i=0; i<lstqualitychecknames.size();i++)
        {
            if(lstqualitychecknames.get(i).getText().equalsIgnoreCase(qualitycheckValues))
            {
                reusableUtils.waitUtillElementIsVisible(lstqualitycheckCheckboxes.get(i));
                lstqualitycheckCheckboxes.get(i).click();
                //System.out.println(lstqualitychecknames.get(i).getText());


            }
        }
        reusableUtils.waitUtillElementIsVisible(columns);
        reusableUtils.clickElement(enterText);
        reusableUtils.updateElementValue(enterText,Value);

    }

    public void matchDatatypevalidation()
    {
        reusableUtils.validateElementDispalyed(datatypevalidation);

    }

    public void matchtype(String datatype)
    {
        reusableUtils.waitUtillElementIsVisible(lstdatatype.get(0));

        for(int i=0;i<lstdatatype.size();i++)
        {
            if(lstdatatype.get(i).getText().equalsIgnoreCase(datatype))
            {
                lstdatatypecheckboxes.get(i).click();

            }
        }
    }

    public void addDataqualityCheck()
    {

        reusableUtils.waitUtillElementIsVisible(addDataqualitycheckbutton);
        reusableUtils.scrollToElement(addDataqualitycheckbutton);
        reusableUtils.clickElement(addDataqualitycheckbutton);

    }

    public void createDQrule() {
        reusableUtils.clickElement(createDqruleButton);


    }

    public String dqruleName(String rulename)
    {
        Random rand=new Random();
        int randomInRange = rand.nextInt(100);
        String strRuleName=rulename+randomInRange;
        reusableUtils.updateElementValue(dqrulename,strRuleName);
        System.out.println(strRuleName);
        return strRuleName;


    }

    public void createDataQualityRule()
    {
        reusableUtils.clickElement(createDataqualityRule);

    }

    public void validatingDQRulename(String strRuleName){
        boolean value =false;
        for(int i=0;i<lstDQRulenameColumn.size();i++)
        {
            if(lstDQRulenameColumn.get(i).getText().equalsIgnoreCase(strRuleName)) {

                value=true;
                System.out.println(strRuleName);

            }
        }
        reusableUtils.validateAssertTrue(value,"DQRule name is not present");
    }

    public void loginToDqg(String strAppURL)
    {
        reusableUtils.gotoURL(strAppURL);
        reusableUtils.clickElement(logintodqgbutton);


    }
    public void enterValidCredentials() throws InterruptedException
    {
        reusableUtils.waitUtillElementIsVisible(email);
        reusableUtils.switchToWindow("Sign in to your account");
        reusableUtils.waitUtillElementIsVisible(email);
        reusableUtils.clickElement(email);
        reusableUtils.updateElementValue(email,"Bhasha.k@Kairostech.com");
        reusableUtils.clickElement(nextbtn);
        reusableUtils.updateElementValue(password,"Mbbasha123@");
        reusableUtils.waitUtillElementIsVisible(signinbutton);




    }

    public void signin()
    {
        reusableUtils.clickElement(signinbutton);
        reusableUtils.clickElement(yesbutton);
        reusableUtils.switchToWindow("Data Quality Gateway");
        reusableUtils.waitUtillElementIsVisible(confirmbutton);
        reusableUtils.clickElement(confirmbutton);

    }

}
