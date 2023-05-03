package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngFirstExample {

	
	@Test(priority=1, invocationCount = 5)
	public void Openapp()
	{
		System.out.println("Opening app");
		
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void Login()
	{
		System.out.println("Login to app");
	}
	
	@Test(priority=3)
	public void Logout()
	{
		System.out.println("Logout from app");
	}
	
}
