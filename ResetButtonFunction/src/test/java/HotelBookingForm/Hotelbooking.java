package HotelBookingForm;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hotelbooking
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
				+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/hotelbooking.html");
		
		//******************************************************************************
		driver.findElement(By.id("txtFirstName")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtFirstName")).sendKeys("Satyapal");
		
		//******************************************************************************
		driver.findElement(By.id("txtLastName")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtLastName")).sendKeys("Kumar");
		
		//******************************************************************************
		driver.findElement(By.id("txtEmail")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtEmail")).sendKeys("satyapal@gmail.com");
		
		//******************************************************************************
		driver.findElement(By.id("txtPhone")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtPhone")).sendKeys("7618515569");
		
		//Select dropCity=new Select(driver.findElement(By.name("City")));
		//dropCity.selectByVisibleText("Pune");
		
		
		//**********************************************************************************************************
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("Talwade, Pune");
		
		
		//**********************************************************************************************************
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[7]/td[2]/select")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[7]/td[2]/select")).sendKeys("Pune");
		
		//**********************************************************************************************************
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[8]/td[2]/select")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[8]/td[2]/select")).sendKeys("Maharashtra");
		
		//**********************************************************************************************************
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[10]/td[2]/select")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[10]/td[2]/select")).sendKeys("3");
		
		//**********************************************************************************************************
		driver.findElement(By.id("txtCardholderName")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtCardholderName")).sendKeys("Satyapal Kumar");
		
		//**********************************************************************************************************
		driver.findElement(By.id("txtDebit")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtDebit")).sendKeys("7898785845784575");
		
		//**********************************************************************************************************
		driver.findElement(By.id("txtCvv")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtCvv")).sendKeys("457");
		
		//**********************************************************************************************************
		driver.findElement(By.id("txtMonth")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtMonth")).sendKeys("February");
		
		//**********************************************************************************************************
		driver.findElement(By.id("txtYear")).sendKeys("");
		Thread.sleep(100);
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		driver.findElement(By.id("txtYear")).sendKeys("2024");
		
		//**********************************************************************************************************
		driver.findElement(By.id("btnPayment")).click();
		
		
		
		
	}

	private static void callAlert() throws InterruptedException
	{
		Alert btnPayment=driver.switchTo().alert();
		System.out.println("The Alert: "+btnPayment.getText());
		Thread.sleep(3000);
		btnPayment.accept();
		
	}

}
