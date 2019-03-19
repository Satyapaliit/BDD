package AletDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU"
				+ "\\Desktop\\Material\\Module3\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/AlertBoxDemos.html");
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Message is:"+alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		Alert confirm=driver.switchTo().alert();
		System.out.println("Alert Message is:"+alert.getText());
		confirm.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		confirm=driver.switchTo().alert();
		System.out.println("Alert Message is:"+alert.getText());
		confirm.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(2000);
		
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Satyapal");
		System.out.println("Alert Message is:"+alert.getText());
		confirm.accept();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
