package Multscrpt;

import org.testng.annotations.Test;

public class Testcase04 extends GenericScript
{
	@Test
	public void Title()
	{
		System.out.println(driver.getCurrentUrl());
	}
}
