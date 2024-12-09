package testng;

import org.testng.annotations.Test;

public class Priorityng 
{
	@Test(priority = 0)
	public void signup()
	{
		System.out.println("Signup is successfull");
	}
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login is successfull");
	}
	@Test(priority = 2)
	public void homepage()
	{
		System.out.println("Homepage is successfull");
	}
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("Logout is successfull");
	}
}
