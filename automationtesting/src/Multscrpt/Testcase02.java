package Multscrpt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase02 extends GenericScript
{
	@Test
	public void pwd()
	{
		boolean displayed = driver.findElement(By.id("pass")).isDisplayed();
		boolean enabled = driver.findElement(By.id("pass")).isEnabled();
		System.out.println(displayed+" "+enabled);
	}
}
