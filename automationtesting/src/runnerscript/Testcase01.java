package runnerscript;

import org.testng.annotations.Test;

import Facebook.Basepage;
import pageobject.loginpage;

public class Testcase01 extends Basepage
{
	@Test
	public void Login() 
	{
		loginpage lp = new loginpage(driver);
		lp.Enterusn();
		lp.Enterpsw();
		lp.clicklogin();
		
	}
}
