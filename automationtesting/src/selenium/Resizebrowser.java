package selenium;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizebrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d=new Dimension(600, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(400,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.quit();
	}
}
