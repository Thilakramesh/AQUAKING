package selenium.JavaScriptExecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPtsk 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);	
		}
		for(int j=0;j<3;j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);	
		}
		driver.quit();
	}
}