package Hotelbooking;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageBin.HotelBookingPageFactory;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"})
public class StepDef
{
	private WebDriver driver;
	private HotelBookingPageFactory pfObj;
	

@Given("^User is on Hotel Booking Page$")
public void user_is_on_Hotel_Booking_Page() throws Throwable
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	pfObj=new HotelBookingPageFactory(driver);
	driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/hotelbooking.html");
}

@Then("^Check the title of the page$")
public void check_the_title_of_the_page() throws Throwable
{
	String title=driver.getTitle();
	if(title.contentEquals("Hotel Booking"))
	{
		System.out.println("***********Title Matched**************");
	}
	else
	{
		System.out.println("***********Title Not Matched**************");
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.close();
    
}

@When("^User enters all valid data$")
public void user_enters_all_valid_data() throws Throwable
{
	pfObj.setPfname("Satyapal"); Thread.sleep(10000);
    pfObj.setPflname("Kumar");
    pfObj.setPfemail("satyapal@gmail.com");
    pfObj.setPfmobile("7618515569");
    pfObj.setPfcity("Pune");
    pfObj.setPfstate("Maharashtra");
    pfObj.setPfpersons(3);
    pfObj.setPfcardholder("Satyapal Kumar");
    pfObj.setPfdebit("4578968877452145");
    pfObj.setPfcvv("254");
    pfObj.setPfmonth("Jan");
    pfObj.setPfyear("2024");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    pfObj.setPfbutton();
    driver.close();
    
}

@Then("^Navigate to Welcome Page$")
public void navigate_to_Welcome_Page() throws Throwable
{
	driver.navigate().to("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/success.html");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.close();
    
}

@When("^User leaves First Name blank$")
public void user_leaves_First_Name_blank() throws Throwable
{
	 pfObj.setPfname(""); Thread.sleep(1000);
    
}

@When("^clicks the Submit button$")
public void clicks_the_Submit_button() throws Throwable
{
	pfObj.setPfbutton();
    
}

@Then("^Display the Alert Message$")
public void display_the_Alert_Message() throws Throwable
{
	String alertMessage=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	System.out.println("******"+alertMessage);
	driver.close();
    
}

@When("^user leaves Last Name blank$")
public void user_leaves_Last_Name_blank() throws Throwable
{
	pfObj.setPfname("Satyapal");	Thread.sleep(1000);
	pfObj.setPflname("");	Thread.sleep(1000);
	pfObj.setPfbutton();
    
}

@When("^user leaves Email blank$")
public void user_leaves_Email_blank() throws Throwable
{
	pfObj.setPfname("Satyapal");	Thread.sleep(1000);
	pfObj.setPflname("Kumar");	Thread.sleep(1000);
	pfObj.setPfemail("");	Thread.sleep(1000);
	pfObj.setPfbutton();
    
}

@When("^clicks the button$")
public void clicks_the_button() throws Throwable
{
	pfObj.setPfbutton();
}

@When("^user enters all data$")
public void user_enters_all_data() throws Throwable
{
	pfObj.setPfname("Satyapal");	Thread.sleep(1000);
	pfObj.setPflname("Kumar");	Thread.sleep(1000);
	pfObj.setPfemail("satyapal@gmail.com");	Thread.sleep(1000);
	pfObj.setPfmobile("7722005480");	Thread.sleep(1000);
	pfObj.setPfcity("Pune");	Thread.sleep(1000);
	pfObj.setPfstate("Maharashtra");	Thread.sleep(1000);
	pfObj.setPfpersons(5);	Thread.sleep(1000);
	pfObj.setPfcardholder("Satyapal Kumar");	Thread.sleep(1000);
	pfObj.setPfdebit("5678567867897890");	Thread.sleep(1000);
	pfObj.setPfcvv("067");	Thread.sleep(1000);
	pfObj.setPfmonth("5");	Thread.sleep(1000);
	pfObj.setPfyear("2024"); 
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	pfObj.setPfbutton();
	driver.close();
    
}

@When("^user enters incorrect email format$")
public void user_enters_incorrect_email_format() throws Throwable
{
	pfObj.setPfemail("Rk2@.com");	Thread.sleep(1000);
	pfObj.setPfbutton();
    
}

@When("^user leaves Mobile blank$")
public void user_leaves_Mobile_blank() throws Throwable
{
    
    
}

@When("^user enters incorrect mobileno format$")
public void user_enters_incorrect_mobileno_format() throws Throwable {
    
    
}

@When("^clicks the button$")
public void clicks_the_button(DataTable arg1) throws Throwable {
    
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

@When("^user does not select city$")
public void user_does_not_select_city() throws Throwable {
    
    
}

@When("^user does not select state$")
public void user_does_not_select_state() throws Throwable {
    
    
}

@When("^user enters (\\d+)$")
public void user_enters(int arg1) throws Throwable {
    
    
}

@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
    
    
}

@When("^user leaves CardHolderName blank$")
public void user_leaves_CardHolderName_blank() throws Throwable {
    
    
}

@When("^user leaves DebitCardNo blank$")
public void user_leaves_DebitCardNo_blank() throws Throwable {
    
    
}

@When("^user leaves ExpirationMonth blank$")
public void user_leaves_ExpirationMonth_blank() throws Throwable {
    
    
}

@When("^user leaves ExpirationYr blank$")
public void user_leaves_ExpirationYr_blank() throws Throwable {
    
    
}


	
	




}
