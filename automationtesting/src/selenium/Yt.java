package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		WebElement search=driver.findElement(By.cssSelector("input[type='text']"));
		//WebElement song=driver.findElement(By.id("search"));
		search.sendKeys("Big dawgs");
		Thread.sleep(3000);
		
		WebElement searchbtn=driver.findElement(By.id("search-icon-legacy"));
		searchbtn.click();
		//WebElement video=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and @aria-label='Hanumankind – Big Dawgs | Ft. Kalmi (Official Music Video) | Def Jam India by Hanumankind 145,891,117 views 3 months ago 3 minutes, 55 seconds']"));
		Thread.sleep(2000);
		
		WebElement vid = driver.findElement(By.xpath("//a[@id='thumbnail' and @class='yt-simple-endpoint inline-block style-scope ytd-thumbnail' and @href='/watch?v=hOHKltAiKXQ&pp=ygUJQmlnIGRhd2dz']"));
		vid.click();
		Thread.sleep(200000);
		driver.quit();
		//System.out.println("Dev");
	}
}
