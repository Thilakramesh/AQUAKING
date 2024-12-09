package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Frames/Mainpage.html");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Thilak");
		Thread.sleep(2000);
		//WebElement f1= driver.findElement(By.xpath("//iframe[@id='f1']"));
		//driver.switchTo().frame(f1);
		//driver.switchTo().frame("f1");
		driver.switchTo().frame(0);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("admin@123");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement mob= driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("6362228644");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("qsp123@gmail.com");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		mob.clear();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		usn.clear();
		Thread.sleep(2000);
		driver.quit();
	}
}
