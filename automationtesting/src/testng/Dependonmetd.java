package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependonmetd 
{
	@Test
	public void signup()
	{
		System.out.println("Signup page is displayed");
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		Assert.fail();
		System.out.println("Login is successfull");
	}
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("Homepage is successfull");
	}
}
