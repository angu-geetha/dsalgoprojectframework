package utilities;

import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeStep
    public void beforeScenario(){
        System.out.println("This will run before the every Step");
    }	
	@io.cucumber.java.Before
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	@io.cucumber.java.After (order = 1)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }	
	@io.cucumber.java.After (order = 0)
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }	

	
}