package org.testing.Testscripts.YTFramework;

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

public class TC_8 extends base{

	@Test
	public void History() throws InterruptedException {
		login Login=new login(driver,pr);
		Login.signin("kirtiyt27@gmail.com", "Diamond$152");

        WebElement library=driver.findElement(By.xpath(pr.getProperty("TC_8_library")));
        library.click();
        Thread.sleep(4000);
        
        
        logout log=new logout(driver,pr);
		log.signingout();
    	 Thread.sleep(2000); 
    	 
          }
	  	  		
}

