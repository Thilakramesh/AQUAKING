package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			WebElement singup= driver.findElement(By.id("nav-link-accountList"));
			singup.click();
			Thread.sleep(3000);
			WebElement phn= driver.findElement(By.id("ap_email"));
			phn.sendKeys("6362228644");
			Thread.sleep(5000);
			WebElement cont=driver.findElement(By.id("continue"));
			cont.click();
			Thread.sleep(5000);
			WebElement psw=driver.findElement(By.id("ap_password"));
			psw.sendKeys("thilak143");
			Thread.sleep(5000);
			WebElement login=driver.findElement(By.id("signInSubmit"));
			login.click();
			WebElement cart= driver.findElement(By.id("nav-cart-count"));
			cart.click();
			Thread.sleep(5000);
			WebElement pcb= driver.findElement(By.id("sc-buy-box-ptc-button"));
			pcb.click();
			Thread.sleep(7000);
			WebElement useadd=driver.findElement(By.id("orderSummaryPrimaryActionBtn"));
			useadd.click();
			Thread.sleep(7000);
		//	WebElement cod=driver.findElement(By.id("pp-vumMR8-157"));
			//cod.click();
			Thread.sleep(7000);
			WebElement usepay=driver.findElement(By.id("pp-7HFji8-139"));
			usepay.click();
			Thread.sleep(7000);
			WebElement placeorder=driver.findElement(By.id("submitOrderButtonId"));
			placeorder.click();
			Thread.sleep(7000);
		}
}
