package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Webele.html");
		WebElement usn =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				usn.sendKeys("admin");
			}
			else
			{
				System.out.println("USn is displayed");
			}
		}
		else
		{
			System.out.println("usn is not display");
		}
	}
}
