package testng;

import org.testng.annotations.Test;

public class skipmethod 
{
	@Test
	public void Signup() 
	{
		System.out.println("Signup is sucessfull");
	}
	@Test
	public void login()
	{
		System.out.println("Login is successfull");
	}
	@Test(enabled = false)
	public void homepage()
	{
		System.out.println("Homepage is successfull");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout is successfull");
	}
}
