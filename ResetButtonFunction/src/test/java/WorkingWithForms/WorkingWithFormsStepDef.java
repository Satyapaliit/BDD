package WorkingWithForms;


import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},monochrome = true)
public class WorkingWithFormsStepDef
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

@When("^Enter the  Details$")
public void enter_the_Details(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	
	List<List<String>> l=arg1.raw();
	
	driver.findElement(By.name("txtUName")).sendKeys(l.get(1).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.id("txtPassword")).sendKeys(l.get(2).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.className("Format")).sendKeys(l.get(3).get(1));
	Thread.sleep(100);
	
	
	driver.findElement(By.cssSelector("input.Format1")).sendKeys(l.get(4).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.name("txtLN")).sendKeys(l.get(5).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.cssSelector("input[value='Male']")).click();
	Thread.sleep(100);
	
	driver.findElement(By.name("DtOB")).sendKeys(l.get(7).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.name("Email")).sendKeys(l.get(8).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.name("Address")).sendKeys(l.get(9).get(1));
	Thread.sleep(100);
	
	
	Select dropCity=new Select(driver.findElement(By.name("City")));
	dropCity.selectByVisibleText(l.get(10).get(1));
	
	driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys(l.get(11).get(1));
	Thread.sleep(100);
	
	driver.findElement(By.cssSelector("input[value='Music']")).click();
	Thread.sleep(100);
	
	
	
	
	
}

@Then("^Reset the credentials$")
public void reset_the_credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	

	driver.findElement(By.name("submit")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.name("reset")).click();
	Thread.sleep(1000);
	
	
	
	
}



}
