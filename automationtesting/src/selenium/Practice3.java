package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice3 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Frames/Cb.html");
		Thread.sleep(2000);
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=cb.size();
		for(int i=1;i<count;i=i+2)
		
			{
			WebElement cba=cb.get(i);
			Thread.sleep(2000);
			cba.click();
			}
		
		Thread.sleep(2000);
		for(int i=count-1;i>=1;i=i-2)
		{
			
				WebElement cbcb=cb.get(i);
				cbcb.click();
			
		}
		
		driver.quit();
	}
}
