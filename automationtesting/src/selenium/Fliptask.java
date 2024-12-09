package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fliptask 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone11");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Apple iPhone 11 (Black, 64 GB)']")).click();
		Thread.sleep(2000);
		
		WebElement adtocrt = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		if(adtocrt.isDisplayed())
		{
			adtocrt.click();
			Thread.sleep(2000);
		}
		else
		{
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']")).click();
		}	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']")).sendKeys("6362228644");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='QqFHMw YhpBe+ _7Pd1Fp']")).click();
		Thread.sleep(1000); 
		
		
		
		
		
		
		driver.quit();
	}
}
