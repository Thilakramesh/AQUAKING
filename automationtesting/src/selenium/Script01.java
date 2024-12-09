package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	  driver.get("https://www.youtube.com");
	  driver.findElement(By.xpath("//input[@id='search']")).click();
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tom and Jerry");
	  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@href=\"/watch?v=AB4JZr9nWCY&list=PLbEif3LMBbrxFaXONS-1Uf51G0hkzQ3j4\" and @class=\"yt-simple-endpoint style-scope ytd-playlist-renderer\"]")).click();
	  Thread.sleep(4000);
	  //driver.quit();
	}

}
