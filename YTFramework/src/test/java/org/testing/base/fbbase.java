package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class fbbase {
	public ChromeDriver driver;
	 public Properties pr;
			
		@BeforeMethod
		public void browserlaunch() throws InterruptedException, IOException{
				
		      System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		      driver=new ChromeDriver();
		      File f=new File("../YTFramework/fbobject.properties");
			  FileReader fr=new FileReader(f);
			  pr=new Properties();
			  pr.load(fr);
			  Thread.sleep(3000);
			  driver.get("https://en-gb.facebook.com/");
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
			 }
		@AfterMethod
		public void driverclose() {
			driver.close();
		}
	}


