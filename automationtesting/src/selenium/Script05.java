package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/binod/OneDrive/Desktop/Demo5.html");
		WebElement ele=driver.findElement(By.id("t1"));
		ele.sendKeys("Thilak");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.name("n1"));
		pwd.sendKeys("143");
		Thread.sleep(2000);
		WebElement confpwd=driver.findElement(By.className("c1"));
		confpwd.sendKeys("143");    
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.linkText("Instagram 2024"));
		link.click();
	}
}
