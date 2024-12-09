package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdwntsk2 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement dp = driver.findElement(By.xpath("(//select[@id='select-multiple-native' and @class='MuiNativeSelect-select MuiNativeSelect-outlined MuiNativeSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-h8h8y'])[1]"));
		Select s= new Select(dp);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("Running Shoes");
		Thread.sleep(1000);
		s.selectByVisibleText("Running Shoes");
		Thread.sleep(1000);
		
		WebElement add = driver.findElement(By.xpath("//button[.='Add']"));
		add.click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
