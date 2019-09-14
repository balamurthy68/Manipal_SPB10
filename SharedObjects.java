package code;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class SharedObjects {
	public WebDriver driver;
	public Scenario scenario;
	
 public String getScenarioname() {
	 
	 return scenario.getName();
 }
	
}
