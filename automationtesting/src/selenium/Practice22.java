package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice22 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@id='email']"));
		usn.sendKeys("Fresher@gmail.com");
		Thread.sleep(1000);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Fresher@2024");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		WebElement apt=driver.findElement(By.xpath("//li[@class='root-level has-sub']"));
		apt.click();
		Thread.sleep(1000);
		WebElement apt1=driver.findElement(By.xpath("(//i[@class='entypo-dot'])[1]"));
		apt1.click();
		Thread.sleep(1000);
		WebElement newapt=driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		newapt.click();
		Thread.sleep(1000);
		WebElement date=driver.findElement(By.xpath("//input[@class='form-control datepicker']"));
		date.sendKeys("30/10/2024");
		Thread.sleep(1000);
		WebElement sltpt=driver.findElement(By.xpath("//div[@class='select2-container select2 visible select2-container-active select2-dropdown-open']"));
		sltpt.click();
		WebElement rocky=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]"));
		rocky.click();
		WebElement submit2=driver.findElement(By.xpath("//button[@type='submit']"));
		submit2.click();
		Thread.sleep(4000);
		driver.quit();
	}
}
