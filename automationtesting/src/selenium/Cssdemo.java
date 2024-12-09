package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		WebElement un = driver.findElement(By.cssSelector("input[id='name']"));
		un.sendKeys("Thilak");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("qsp@gmail.com");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("wwwqsp");
		WebElement button=driver.findElement(By.cssSelector("button[type='submit']"));
		button.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
