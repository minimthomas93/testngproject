package testngproject;

	import org.apache.logging.log4j.Logger;
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




	public class ParameterizationProgram {
	
		
		WebDriver driver;
		

		
		@BeforeMethod
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
		
		@Test(priority=2)
		public void login()
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		}
		@Test(priority=3)
		public void endPopup()
		{
			driver.findElements(By.tagName("button")).get(11).click();
		}
		@Test(priority=4)
		public void HomePageTitle()
		{
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Home - QAlegend","Failed");
		}

	@AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}
		
		
	

}
