package sharu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script09 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/binod/OneDrive/Desktop/html/sharu/net.html");
		WebElement link= driver.findElement(By.className("c1"));
		link.click();
	}

}
