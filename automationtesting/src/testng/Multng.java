package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multng 
{
	@Test
	public void Testcase()
	{
		Reporter.log("Hello",true);
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Good noon",true);
	}
}
