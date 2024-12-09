package selenium;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scriptfb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/" );

		WebElement usn=driver.findElement(By.name("email"));
		usn.sendKeys("Qsp");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("gothilla");
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.name("login"));
		link.click();
		
				
	}
}
