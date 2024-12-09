package selenium.Dropdown;

import java.util.List;

import javax.swing.plaf.ListUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwnopts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/binod/OneDrive/Desktop/html/Dropdown.html");
		WebElement dropd=driver.findElement(By.id("Celebrities"));
		Select s = new Select(dropd);
		List<WebElement> opts = s.getOptions();
		int Opstcount = opts.size();
		System.out.println(Opstcount);
		for(int i=0;i<Opstcount;i++)
		{
			WebElement opt = opts.get(i);
			String txt=opt.getText();
			System.out.println(txt);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
