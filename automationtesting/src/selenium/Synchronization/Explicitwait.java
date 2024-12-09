package selenium.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebDriverWait ew = new WebDriverWait(driver, 10);
		ew.until(ExpectedConditions.titleContains("Facebook"));
		String title = driver.getTitle();
		System.out.println(title);
		ew.until(ExpectedConditions.urlContains("facebook"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement usn = driver.findElement(By.id("email"));
		ew.until(ExpectedConditions.visibilityOf(usn));
		usn.sendKeys("admin");
		driver.quit();
		
	}
}
