import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskswaglbs 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		Thread.sleep(1000);
		int count=products.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = products.get(i);
			String text = link.getText();
			System.out.println(i+" "+text);
		} 
		System.out.println("--------------------------------------------");
		driver.findElement(By.xpath("//a[@id='item_4_title_link']")).click();
		Thread.sleep(2000);
	    WebElement prdname = driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		String pname=prdname.getText();
		System.out.println(pname);
		Thread.sleep(1000);
		WebElement prdprice = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String pprice=prdprice.getText();
		System.out.println(pprice);
		Thread.sleep(1000);
		WebElement adtocrt = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		adtocrt.click();
		
//		Actions a = new Actions(driver);
//		a.click().perform();
//		Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		//adtocrt.click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(2000);
//		driver.quit();
	}
}
