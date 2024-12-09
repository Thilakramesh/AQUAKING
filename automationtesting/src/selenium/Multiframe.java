package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiframe {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver" , "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Frames/Mainmult.html");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Admin");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6445645466");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("f2");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qsp@gmail.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
