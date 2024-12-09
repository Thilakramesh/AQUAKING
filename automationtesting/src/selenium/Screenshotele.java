package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotele 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		WebElement netf = driver.findElement(By.xpath("//a[@class='ev1dnif0 e1xphksk0 default-ltr-cache-1ujrpcj-PressableAnchor-StyledPressable-StyledPressable e1ff4m3w1']"));
		Date d = new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
	//	TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = netf.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Scrrenshots/Defect2.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();
	}

}
