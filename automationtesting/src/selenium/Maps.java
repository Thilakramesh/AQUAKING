package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		WebElement dir=driver.findElement(By.cssSelector("div[class='lSDxNd']"));
		dir.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose starting point, or click on the map...']")).sendKeys("Qspiders rajajinagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination, or click on the map...']")).sendKeys("Bengaluru university");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[3]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
