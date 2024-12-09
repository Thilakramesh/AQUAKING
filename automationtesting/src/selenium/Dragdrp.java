package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrp {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome= driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(rome,italy).perform();
		Thread.sleep(2000);
		WebElement madrid= driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(madrid, spain).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
