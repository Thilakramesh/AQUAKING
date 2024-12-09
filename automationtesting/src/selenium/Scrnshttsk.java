package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrnshttsk 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int count=links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp = link.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Scrrenshots/flip/"+i+"Defect.png");
			FileHandler.copy(temp, perm);
		}
		Thread.sleep(2000);
		driver.quit();
}
}	
