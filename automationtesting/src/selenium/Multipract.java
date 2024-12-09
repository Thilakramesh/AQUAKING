package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipract {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver" , "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		
		WebElement f1=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.xpath("//input[@id='email']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("admin@123");
		driver.switchTo().defaultContent();
		WebElement f2=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(f2);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("thilak");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("thilak123");
		Thread.sleep(3000);
		driver.quit();
	}
}
