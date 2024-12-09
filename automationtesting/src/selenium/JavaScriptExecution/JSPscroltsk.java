package selenium.JavaScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPscroltsk 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/* for(int i=0;i<7;i++)
		{
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(1000);	
		} */
		WebElement fb = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
		//fb.click();
		Point loc = fb.getLocation();
		//System.out.println(loc); 
		int y = loc.getY();
		for(int i=0;i<7;i++)
		{
			js.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(1000);	
		}
		fb.click();
		//System.out.println(y);
		
		Thread.sleep(1000);
		driver.quit();
	}
}
