package sharu;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/binod/OneDrive/Desktop/html/sharu/mainpage.html");
		WebElement usn= driver.findElement(By.className("t1"));
		usn.sendKeys("sharath");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//WebElement f1=driver.findElement(By.xpath("//iframe[@src='frame1.html']"));
		
		driver.switchTo().frame("frame1");
		WebElement pass=driver.findElement(By.className("t2"));
		pass.sendKeys("sharu@123");
		driver.switchTo().frame(0);
		WebElement mob=driver.findElement(By.className("t3"));
		mob.sendKeys("9880304174");

		
		

}}
