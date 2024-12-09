package Multscrpt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase06 extends GenericScript
{
	@Test
	public void passdata() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Thilak");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("admin");
		Thread.sleep(2000);
	}
}
