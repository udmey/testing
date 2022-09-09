package org.testing.Testscripts.YTFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.pages.login;
import org.testing.pages.logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_5 extends base{


	@Test
	public void History() throws InterruptedException {
		login Login=new login(driver,pr);
		Login.signin("kirtiyt27@gmail.com", "Diamond$152");
		
		 int i=0;
	     
    	 List<WebElement> allVideo=driver.findElements(By.id(pr.getProperty("TC_4_VideoID")));
          for(WebElement element:allVideo ) {
	          element.click();
	          Thread.sleep(3000);
	          System.out.println(driver.getTitle());
	          Thread.sleep(2000);
	          WebElement subscription=driver.findElement(By.xpath(pr.getProperty("TC_5_Sub")));
	          subscription.click();
	          Thread.sleep(4000);
	          driver.navigate().back();
	          i++;
	          if(i==4) 
	        	  break;
          }
              Thread.sleep(3000);
              
              logout log=new logout(driver,pr);
      		  log.signingout();
	  	
	  	  		
}
}
