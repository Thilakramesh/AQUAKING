package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Facebook.Basepage;

public class loginpage 
{
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement login;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Enterusn()
	{
		usn.sendKeys("admin");
	}
	public void Enterpsw()
	{
		psw.sendKeys("admin123");
	}
	public void clicklogin() 
	{
		login.click();
	}
}
