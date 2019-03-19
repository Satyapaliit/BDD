package MultipleData;

import java.util.List;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"})
public class MultipleDataStepDef
{
	WebDriver driver;
	@Given("^Open the Fireofx and launch the Apllication$")
	public void open_the_Fireofx_and_launch_the_Apllication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
				+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/WorkingWithForms.html");
		
		
	}

	@When("^Enter  the Username and Password$")
	public void enter_the_Username_and_Password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> list=arg1.raw();

		for(int i=0;i<list.size();i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.name("txtUName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("txtUName")).sendKeys(list.get(i).get(0));
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtPassword")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("txtPassword")).sendKeys(list.get(i).get(1));
			Thread.sleep(2000);
			
		}
		
		/*driver.findElement(By.className("Format")).sendKeys("123");
		Thread.sleep(1000);
	*/
	}

	@Then("^Restet the Credentials$")
	public void restet_the_Credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("reset")).click();
		
		
	}
}
