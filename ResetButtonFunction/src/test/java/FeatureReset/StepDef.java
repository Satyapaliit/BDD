package FeatureReset;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"})
public class StepDef
{
	WebDriver driver;
	
@Given("^Open the firefox and launch the applicatiion$")
public void open_the_firefox_and_launch_the_applicatiion() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
			+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/WorkingWithForms.html");
	
    
}

@When("^Enter the user name and password$")
public void enter_the_user_name_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.name("txtUName")).sendKeys("satyapal");
	Thread.sleep(1000);
	
	driver.findElement(By.id("txtPassword")).sendKeys("123");
	Thread.sleep(1000);
	
	driver.findElement(By.className("Format")).sendKeys("123");
	Thread.sleep(1000);
	
}

@Then("^reset the Credentials$")
public void reset_the_Credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
	driver.findElement(By.name("reset")).click();
	Thread.sleep(1000);
	
}


}
