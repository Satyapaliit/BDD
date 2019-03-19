package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkinkWithForms {

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
				+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/WorkingWithForms.html");
		
		try
		{
			driver.findElement(By.name("txtUName")).sendKeys("Pandit");
			Thread.sleep(1000);
			
			driver.findElement(By.id("txtPassword")).sendKeys("123");
			Thread.sleep(1000);
			
			driver.findElement(By.className("Format")).sendKeys("123");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input.Format1")).sendKeys("Satyapal");
			Thread.sleep(1000);
			
			driver.findElement(By.name("txtLN")).sendKeys("Kumar");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[value='Male']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("DtOB")).sendKeys("02/02/1998");
			Thread.sleep(1000);
			
			driver.findElement(By.name("Email")).sendKeys("satyapal@gmail.com");
			Thread.sleep(1000);
			
			driver.findElement(By.name("Address")).sendKeys("Talwade, Pune");
			Thread.sleep(1000);
			
			
			Select dropCity=new Select(driver.findElement(By.name("City")));
			dropCity.selectByVisibleText("Pune");
			
			driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("7618515569");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[value='Music']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[value='Reading']")).click();
			Thread.sleep(1000);
			
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("reset")).click();
			Thread.sleep(1000);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
