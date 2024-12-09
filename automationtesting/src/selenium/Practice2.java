package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Practi.html");
		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		WebElement confpwd = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		confpwd.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		pwd.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement conf = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		conf.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		conf.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
