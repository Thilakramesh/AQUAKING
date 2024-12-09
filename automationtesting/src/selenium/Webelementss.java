package selenium;

import java.util.List;

import javax.swing.plaf.ListUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			WebElement link=links.get(i);
			String url=link.getAttribute("href");
			System.out.println(url);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
