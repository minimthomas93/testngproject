package testngproject;

import org.testng.annotations.Test;

public class GroupingExample {
	

	@Test(priority=1,groups= {"Sanity","Regression"})
	public void signUpByEmail()
	{
		System.out.println("Signup by Email");
	}
	
	@Test(priority=2,groups= {"Regression"})
	public void signUpByFacebook()
	{
		System.out.println("Signup by Facebook");
	}
	
	@Test(priority=3,groups= {"Regression"})
	public void signUpByTwitter()
	{
		System.out.println("Signup by Twitter");
	}
	
	@Test(priority=4,groups= {"Sanity","Regression"})
	public void paymentInRupees()
	{
		System.out.println("payment In Rupees");
	}
	
	@Test(priority=5,groups= {"Sanity"})
	public void paymentInDollar()
	{
		System.out.println("payment In Dollar");
	}
	
	@Test(priority=6,groups= {"Sanity"})
	public void paymentReturnByBank()
	{
		System.out.println("payment return by bank");
	}
	
	
}
