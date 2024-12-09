package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdriver1  {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis= new FileInputStream("./Testdata/Credentials.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(1);
		String pwd = cell.getStringCellValue();
		//String s=val;
		System.out.println(pwd);
		XSSFSheet sheet1= workbook.getSheet("Sheet1");
		XSSFRow row1=sheet1.getRow(2);
		XSSFCell cell1=row1.getCell(0);
		String un = cell1.getStringCellValue();
	//	String s2=val1;
		System.out.println(un);
		workbook.close();
		fis.close();
	//	System.out.println(s2);
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
