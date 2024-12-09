import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tskama 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist watches for mens");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		WebElement fossil = driver.findElement(By.xpath("(//li[@id='p_123/179010'])[1]"));
		fossil.click();
		Thread.sleep(3000);
		//WebElement leather = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[16]"));
		//leather.click();
	//	Thread.sleep(3000);
		
		driver.quit();
	}
}
