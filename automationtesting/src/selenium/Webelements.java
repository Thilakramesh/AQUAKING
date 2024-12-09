package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement login = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		Point p=login.getLocation();
		System.out.println(p);
		WebElement Login = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		int h=Login.getSize().getHeight();
		int w=Login.getSize().getWidth();
		System.out.println(h+" "+w);
		
		//	int x=p.getX();
	//	int y=p.getY();
	//	System.out.println(p.getX()+" "+p.getY());
		Thread.sleep(2000);
		driver.quit();
	}
}
