package testngproject;

	

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.Test;
	import utilityPrograms.Datadrivenutility;


	public class DataproviderProgram{

	@Test(priority=3,dataProvider = "testData", dataProviderClass=Datadrivenutility.class)
	public void getSetofUsers(String Message,String ValueA,String ValueB) throws
	InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("single-input-field")).sendKeys(Message);
	driver.findElement(By.id("button-one")).click();
	driver.findElement(By.id("value-a")).sendKeys(ValueA);
	driver.findElement(By.id("value-b")).sendKeys(ValueB);
	driver.findElement(By.id("button-two")).click();
	driver.findElement(By.id("single-input-field")).clear();
	driver.findElement(By.id("value-a")).clear();
	driver.findElement(By.id("value-b")).clear();
	driver.quit();
	}

	}

