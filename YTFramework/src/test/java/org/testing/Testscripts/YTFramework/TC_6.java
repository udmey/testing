package org.testing.Testscripts.YTFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.base;
import org.testing.pages.login;
import org.testing.pages.logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_6 extends base{


	@Test
	public void History() throws InterruptedException {
		login Login=new login(driver,pr);
		Login.signin("kirtiyt27@gmail.com", "Diamond$152");
		
		 int i=0;

        String comment="Commenting publicly as kirti sharma";
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String currentwindow=driver.getWindowHandle();
   	    
   	    Actions ac=new Actions(driver);
   	    
    	 List<WebElement> allVideo=driver.findElements(By.id(pr.getProperty("TC_4_VideoID")));
          for(WebElement element:allVideo ) {
        	  ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
     		 i++;
     		 if(i==4) 
     			 break;	
     	 }
          
          Thread.sleep(2000);
          driver.switchTo().window(currentwindow);
          Set<String> totalwindows=driver.getWindowHandles();
          
          Iterator<String> it=totalwindows.iterator();
          String first= it.next();
          String second= it.next();
           String third= it.next();
           String fourth= it.next();
           String fifth= it.next();
           String sixth= it.next();
           Thread.sleep(6000);
           driver.switchTo().window(fourth);
           Thread.sleep(6000);
           js.executeScript("window.scrollBy(0,500)");
           Thread.sleep(6000);
	      // System.out.println(driver.findElement(By.xpath("//*[contains(@aria-label, 'Commenting publicly as kirti sharma')]")).getText());
           driver.findElement(By.xpath(pr.getProperty("TC_6_clickcommentbox"))).click();
           WebElement entercomment=driver.findElement(By.xpath(pr.getProperty("TC_6_entercomments")));
	       entercomment.sendKeys("testing by lovely");
	       Thread.sleep(2000);	       
	      WebElement commentclick= driver.findElement(By.xpath(pr.getProperty("TC_6_commententer")));
	      commentclick.click();
	      
	      Thread.sleep(3000);
	      logout log=new logout(driver,pr);
  		  log.signingout();
          }
	
}
