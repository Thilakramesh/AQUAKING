package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jcip.annotations.ThreadSafe;

public class Cssfb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement un= driver.findElement(By.cssSelector("input[id='email']"));
	un.sendKeys("Selenium");
	Thread.sleep(2000);
	WebElement pwd= driver.findElement(By.cssSelector("input[id='pass']"));
	pwd.sendKeys("selva");
	Thread.sleep(2000);
	WebElement login= driver.findElement(By.cssSelector("button[type='submit']"));
	login.click();
	Thread.sleep(5000);
	driver.quit();
}
}
