package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmuldata 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis= new FileInputStream("./Testdata/Credentials.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for(int i=0;i<lr;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String c1val=cell.getStringCellValue();
			XSSFCell cell2=row.getCell(1);
			String c2val=cell2.getStringCellValue();
			System.out.println(c1val+" "+" "+c2val);
		}
		book.close();
		fis.close();
	}
}
