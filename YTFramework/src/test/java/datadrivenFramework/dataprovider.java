package datadrivenFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataprovider extends base {
	@Test(dataProvider="data1")
	public void signin(String user, String Password) throws InterruptedException {
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("Login_1")));
		signin.click();
		
		WebElement emailid=driver.findElement(By.xpath(pr.getProperty("Login_2")));
		emailid.sendKeys(user);
		Thread.sleep(3000);
		WebElement Next=driver.findElement(By.xpath(pr.getProperty("Login_3")));
		Next.click();
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath(pr.getProperty("Login_4")));
		password.sendKeys(Password);
		WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Login_5")));
		Next2.click();
		Thread.sleep(4000);
		
		driver.navigate().back();
	}
	
	
	@DataProvider
	public Object[][] data2() throws BiffException, IOException{
		File f= new File("../YTFramework/dataprovider.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh= wk.getSheet(0);
		int rows=sh.getRows();
		int columns=sh.getColumns();
		
		Object[][] ob=new Object[rows][columns];
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++)
			{
				Cell c1=sh.getCell(j, i);
				ob[i][j]=c1.getContents();
			}
			
		}
		
		return ob;
		
	}
	
	@DataProvider
	public Object[][] data1(){
		Object[][] ob=new Object[2][2];
		ob[0][0]="lslsovelysharma@gmail.com";
	    ob[0][1]="Diamond$152";
		ob[1][0]="lovely2";
		ob[1][1]="password2";
		return ob;
		
	}

}


