package com.testcases.www;

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
import org.testng.annotations.Test;

public class ExcelSheet {
	@Test
	public void excelsheet() throws IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Dell\\Desktop\\ExcelSheet1.xlsx");  
		//excel sheet path
		
		XSSFWorkbook worksheet= new XSSFWorkbook(fs); 
		// to enter into the workSheet.
		
		XSSFSheet sheet=worksheet.getSheetAt(0);  
		// to enter into specific sheet {index}
		
		XSSFRow row= sheet.getRow(1);  
		// to enter into specific row for username
		
		XSSFCell cell = row.getCell(0); 
		// to enter into specific columnfor username
		
		System.out.println(cell);  // To print Username on console
		
		String username=cell.toString(); 
		//converted into String....
		
		XSSFRow row1= sheet.getRow(1);  
		// to enter into specific row for password
		
		XSSFCell cell1 = row.getCell(1); 
		// to enter into specific column for password
		
		System.out.println(cell1);  // To print Password on console
		
		String password=cell1.toString();
		//converted into String....
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement UN= driver.findElement(By.id("username"));
		WebElement PWD= driver.findElement(By.id("password"));
		
		UN.sendKeys(username);
		PWD.sendKeys(password);
		
		
		
		
		
		
		
	}

}
