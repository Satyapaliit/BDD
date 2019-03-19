package LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageBin.LoginPagePageFactory;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"})
public class LoginPageStepDef
{
	WebDriver driver;
	LoginPagePageFactory pfObj;
	
	@Given("^user is on the Login Page$")
	public void user_is_on_the_Login_Page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU\\Desktop\\Material\\Module3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pfObj=new LoginPagePageFactory(driver);
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/login.html");
	}

	@When("^User enters the valid data$")
	public void user_enters_the_valid_data() throws Throwable
	{
		Thread.sleep(2000);
		pfObj.setPfusername("capgemini"); Thread.sleep(10000);
		pfObj.setPfpassword("capg1234"); Thread.sleep(10000);
	}

	@When("^Clicks on the Submit button$")
	public void clicks_on_the_Submit_button() throws Throwable
	{
		pfObj.setPfbutton();
		Thread.sleep(2000);
	}

	@Then("^Navigate to Welcome Page$")
	public void navigate_to_Welcome_Page() throws Throwable
	{
		//driver.navigate().to("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/success.html");
	    driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    driver.close();
	}

	@When("^User enters the invalid UserName$")
	public void user_enters_the_invalid_UserName() throws Throwable
	{
		pfObj.setPfusername("jk"); Thread.sleep(1000);
		WebElement usererr=pfObj.getUsererr();
		System.out.println(usererr);
		pfObj.setPfpassword("capg1234"); Thread.sleep(1000);
	}

	@Then("^Display Alert message$")
	public void display_Alert_message() throws Throwable
	{
		String alertMessage=driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("******"+alertMessage);
		driver.close();
	}

	@When("^User enters the invalid Password$")
	public void user_enters_the_invalid_Password() throws Throwable
	{
		pfObj.setPfusername("capgemini"); Thread.sleep(1000);
		pfObj.setPfpassword("kj"); Thread.sleep(1000);
		WebElement pwderr=pfObj.getPwderr();
		System.out.println(pwderr);
	}

	@When("^User enters the invalid Data$")
	public void user_enters_the_invalid_Data(DataTable arg1) throws Throwable
	{
		List<List<String>> list=arg1.raw();
		pfObj.setPfusername(list.get(0).get(0));
		pfObj.setPfpassword(list.get(0).get(1));
		

	}

}
