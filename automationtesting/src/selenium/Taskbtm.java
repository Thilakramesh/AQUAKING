package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Taskbtm {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
		driver.findElement(By.id("txtOriginGeneral")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtDestinationGeneral")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtDepartDateBooking")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtReturnDateBooking")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='30']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnBusSearchNewGeneral")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("XB27603772")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//small[.='1'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='2'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='3'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='4'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='5'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='6'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn-alert-okay")).click();
		Thread.sleep(1000); 
		driver.findElement(By.id("XB28121682")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//small[.='A11'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='A12'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='A13'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='A14'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='A15'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='A16'])[2]")).click();
		Thread.sleep(1000);  
		driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("Thilak");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("6362228644");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("thilakramesh012@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("btnNext")).click();
		Thread.sleep(3000); 
		driver.quit(); 
	}

}
