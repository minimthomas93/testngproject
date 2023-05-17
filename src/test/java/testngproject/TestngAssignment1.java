package testngproject;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import utilityPrograms.GenericUtility;

//Testcase execution Flow1
//Load page
//login
//endpopup
//Homepagetitle
//welcomeMessage
//Userspage
//close the browser

//Testcase execution Flow2
//Load page
//InvalidLogin
//close the browser

//Testcase execution Flow3
//Load page
//no login
//close the browser


public class TestngAssignment1 {
	
	WebDriver driver;
	GenericUtility gutil;
	
	@Test(priority=1)
	@Parameters({"browser","url"})
	public void loadPage(String browserName,String url)
	{
		//driver=new ChromeDriver();
		if(browserName.equals("chrome")){

            driver = new ChromeDriver(); 
        }
        else if(browserName.equals("FF")){
        
            driver = new FirefoxDriver(); 
        }
        else if(browserName.equals("Edge")){

            driver = new EdgeDriver(); 
        }
        else if(browserName.equals("safari")){
            driver=new SafariDriver();
        }
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	//for generate random user name values
//	public String randomeString()
//	{
//		String generatedString=RandomStringUtils.randomAlphabetic(5);
//		return generatedString;
//	}
	
	@Test(priority=2)
	public void login()
	{
		GenericUtility gutil;
		WebDriver driver = new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.id("username")).sendKeys(randomeString()); -->for generate random username values
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Assert.assertTrue(false);
		
	}
	@Test(priority=3,enabled=false)
	public void endPopup()
	{
		driver.findElements(By.tagName("button")).get(11).click();
	}
	@Test(priority=4,enabled=false)
	public void HomePageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Home - QAlegend","Failed");
		
		
//		if(title.contains("QAlegend"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
	}
//	@Test(priority=5)
//	public void welcomeMessage()
//	{
//		String message=driver.findElement(By.xpath("//div//section[@class=\"content-header\"]")).getText();
////		if(message.contains("Welcome efg,"))
////		{
////			System.out.println("Pass");
////		}
//		Assert.assertEquals(message, null)
//		
//	}
//	@Test(priority=6)
//	public void UsersPage() throws InterruptedException
//	{
//		driver.findElement(By.linkText("User Management")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Users")).click();
//	}
//	
//	
//	
////	@Test
////	public void InvalidLogin()
////	{
////		driver.findElement(By.id("username")).sendKeys("admin12");
////		driver.findElement(By.id("password")).sendKeys("1234562");
////		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
////		String text=driver.findElement(By.xpath("//strong[contains(text(),'These credentials do not match our records.')]")).getText();
////		if(text.contentEquals("These credentials do not match our records."))
////		{
////			System.out.println("pass");
////		}
////	
////	}
////@Test
//	public void noLoginDetails()
//	{
//		driver.findElement(By.id("username")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("");
//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//		
//	}
@Test(priority=4,enabled=false)
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
