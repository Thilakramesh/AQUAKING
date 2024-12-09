package sharu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/binod/OneDrive/Desktop/html/sharu/prime.html");
		driver.findElement(By.tagName("input")).sendKeys("sharath");
		driver.findElement(By.id("cb")).click();
		driver.findElement(By.name("radio")).click();
		driver.findElement(By.className("link")).click();
		
	}

}
