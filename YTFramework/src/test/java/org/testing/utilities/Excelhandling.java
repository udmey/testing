package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {

public static void readdatacell(int initialrow,int endrow) throws IOException {
		

		File f=new File("../projectsOfMaven/test123.xlsx");
		FileInputStream is= new FileInputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook(is);
		XSSFSheet xs=xw.getSheetAt(0);
		int rows=xs.getPhysicalNumberOfRows();
		for(int i=0;i<rows;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int cell= xr.getPhysicalNumberOfCells();
				for(int j=0;j<cell;j++) {
				XSSFCell xc=xr.getCell(j);
				if((i==initialrow)&&(j==endrow))
				System.out.print(xc.getStringCellValue()+"  ");		
		}
			
		}
	
}
public static void readrow(int rownumber) throws IOException {
	

	File f=new File("../projectsOfMaven/test123.xlsx");
	FileInputStream is= new FileInputStream(f);
	XSSFWorkbook xw=new XSSFWorkbook(is);
	XSSFSheet xs=xw.getSheetAt(0);
	int rows=xs.getPhysicalNumberOfRows();
	for(int i=0;i<rows;i++)
	{
		XSSFRow xr=xs.getRow(i);
		int cell= xr.getPhysicalNumberOfCells();
			for(int j=0;j<cell;j++) {
			XSSFCell xc=xr.getCell(j);
			if(i==rownumber){
				System.out.print(xc.getStringCellValue()+"  ");	
			}
			
			}
	     }
	 }
public static void readrowrange(int initialrow,int endrow) throws IOException {
	

	File f=new File("../projectsOfMaven/test123.xlsx");
	FileInputStream is= new FileInputStream(f);
	XSSFWorkbook xw=new XSSFWorkbook(is);
	XSSFSheet xs=xw.getSheetAt(0);
	int rows=xs.getPhysicalNumberOfRows();
	for(int i=0;i<rows;i++)
	{
		XSSFRow xr=xs.getRow(i);
		int cell= xr.getPhysicalNumberOfCells();
			for(int j=0;j<cell;j++) {
			XSSFCell xc=xr.getCell(j);
			if((i>=initialrow)&&(j<=endrow))
			System.out.print(xc.getStringCellValue()+"  ");
			
	}
		
	}
}

}
