package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/Frames/Dropdown.html");
		WebElement dd = driver.findElement(By.id("Celebrities"));
		Select s= new Select(dd);
		if(s.isMultiple())
			System.out.println("Dropdown is Multi dropdown");
		else
			System.out.println("Dropdown is single dropdown");
		Thread.sleep(1000);
		driver.quit();
	}
}
