package sharu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script08 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/binod/OneDrive/Desktop/html/sharu/net.html");
		WebElement link= driver.findElement(By.name("n1"));
		link.click();
		

}}
