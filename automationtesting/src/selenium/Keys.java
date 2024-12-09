package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;

public class Keys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Key.html");
		Thread.sleep(2000);
		WebElement textfld=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		textfld.sendKeys(org.openqa.selenium.Keys.CONTROL+"a");
		textfld.sendKeys(org.openqa.selenium.Keys.BACK_SPACE);
	}
}
