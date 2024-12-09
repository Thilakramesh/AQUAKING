package selenium.Windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parchldadrs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Set<String> wins = driver.getWindowHandles();
		for(String win:wins)
		{
			System.out.println(win);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
