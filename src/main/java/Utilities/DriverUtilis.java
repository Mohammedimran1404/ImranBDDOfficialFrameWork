package Utilities;

import DriverManagers.DriverManager;
import Pages.BasePage;

public class DriverUtilis {

    private final DriverManager driverManager;

    private final BasePage basePage;

    public ScenarioContext scenarioContext;

    public DriverUtilis(){
        driverManager=new DriverManager();
        basePage=new BasePage(driverManager.getWebDriver());
        scenarioContext=new ScenarioContext();
    }

    public DriverManager getDriverManager(){
        return driverManager;
    }
    public BasePage getBasePage(){
        return basePage;
    }
    public ScenarioContext getScenarioContext() {
        return getScenarioContext();
    }
}
