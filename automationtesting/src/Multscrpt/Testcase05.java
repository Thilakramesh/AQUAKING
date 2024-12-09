package Multscrpt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Testcase05 extends GenericScript
{
	@Test
	public void ss() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Scrrenshots/Facebook.png");
		FileHandler.copy(temp, perm);
	}
}
