package pageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory
{
WebDriver driver;
	
	
	

	
	public LoginPagePageFactory(WebDriver driver)
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPagePageFactory()
	{
	
	}

	//Step 1: Identify elements
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfusername;

	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfpassword;
	
	@FindBy(how=How.CLASS_NAME,using="btn")
	@CacheLookup
	WebElement pfbutton;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	WebElement usererr;

	@FindBy(id="pwdErrMsg")
	@CacheLookup
	WebElement pwderr;
	
	
	/****************************************setters************************************************/
	
		
	public void setPfusername(String susername) {
		pfusername.sendKeys(susername);
	}
	
	public void setPfpassword(String spassword) {
		pfpassword.sendKeys(spassword);
	}
	
	public void setPfbutton() {
		pfbutton.click();
	}

	
	/****************************************getters************************************************/
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getPfusername() {
		return pfusername;
	}
	
	public WebElement getPfpassword() {
		return pfpassword;
	}
	
	public WebElement getPfbutton() {
		return pfbutton;
	}

	public WebElement getUsererr() {
		return usererr;
	}

	public WebElement getPwderr() {
		return pwderr;
	}
	
	
	
}
