package Multscrpt;

import org.testng.annotations.Test;

public class Testcase03 extends GenericScript
{
	@Test
	public void Title()
	{
		System.out.println(driver.getTitle());
	}
}
