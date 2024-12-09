package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.Netflix.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-uia='header-login-link']")).click();
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		String an=usn.getAttribute("autocomplete");
		System.out.println("Attribute:"+an);
		String val=usn.getCssValue("font-family");
		System.out.println("Cssvalue:"+val);
		WebElement pwd=driver.findElement(By.xpath("//input[@id=':r3:']"));
		String password=pwd.getTagName();
		System.out.println("Tagname:"+password);
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		String text=btn.getText();
		System.out.println("Text:"+text);
		driver.quit();
	}
}
