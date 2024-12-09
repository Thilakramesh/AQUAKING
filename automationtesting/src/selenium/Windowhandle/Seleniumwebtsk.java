package selenium.Windowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumwebtsk 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		ArrayList<WebElement> ar = new ArrayList<WebElement>();
		WebElement net = driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver'])[1]"));
		WebElement ruby = driver.findElement(By.xpath("(//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0'])[1]"));
		WebElement python = driver.findElement(By.xpath("(//a[@href='https://pypi.python.org/pypi/selenium'])[1]"));
		WebElement js = driver.findElement(By.xpath("(//a[@href='https://npmjs.org/package/selenium-webdriver'])[1]"));
	/*	String netl = net.toString();
		String rubyl = ruby.toString();
		String pythonl = python.toString();
		String jsl = js.toString(); */
		
		ar.add(net);
		ar.add(ruby);
		ar.add(python);
		ar.add(js);
		
		int links = ar.size();
		for(int i=0;i<links;i++)
		{
			
		//Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.contextClick(ar.get(i)).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//
		
		driver.close();
	}
	}
}
