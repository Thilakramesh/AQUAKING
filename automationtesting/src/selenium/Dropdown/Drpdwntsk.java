package selenium.Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdwntsk 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php");
		WebElement dropd=driver.findElement(By.id("month"));
		Select s = new Select(dropd);
		List<WebElement> opts = s.getOptions();
		int Opstcount = opts.size();
		System.out.println(Opstcount);
		System.out.println("---------- Asscending ---------");
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<Opstcount;i++)
		{
			WebElement opt = opts.get(i);
			String txt=opt.getText();
			arr.add(txt);
		}
		Collections.sort(arr);
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		Thread.sleep(2000);
		System.out.println("---------- Descending ---------");
		Collections.sort(arr,Collections.reverseOrder());
		for(String ar1:arr)
		{
			System.out.println(ar1);
		}
		Thread.sleep(2000);
		driver.quit();
	}	
}
