package ScenarioOutline;

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
public class ScenarioOutlineStepDef
{
	WebDriver driver;
	@Given("^Open the firefox and launch the Application$")
	public void open_the_firefox_and_launch_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
				+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/WorkingWithForms.html");
		
	
	}

	@When("^Enter the Username\"([^\"]*)\" and Password\"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("txtUName")).sendKeys(arg1);
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
		Thread.sleep(1000);
	}

	@Then("^Reset the credentials$")
	public void reset_the_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    

		driver.findElement(By.name("reset")).click();
		Thread.sleep(1000);
	}
}
