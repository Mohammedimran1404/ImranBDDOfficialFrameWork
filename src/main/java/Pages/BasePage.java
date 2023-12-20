package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage{

    private final WebDriver webDriver;


    private DQRulePage dqRulePage;
    public BasePage(WebDriver webDriver){

        this.webDriver=webDriver;
    }


    public DQRulePage getDqRulePage()
    {
        return (dqRulePage == null)? dqRulePage =new DQRulePage(webDriver):dqRulePage;
    }
}
