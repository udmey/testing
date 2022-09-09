package org.testing.Testscripts.YTFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.fbbase;
import org.testing.utilities.dropdownhandle;
import org.testng.annotations.Test;

public class facebookdropdown extends fbbase{
	@Test
	public void rdropdownoffb() throws InterruptedException {
	
	WebElement createNewAccount=driver.findElement(By.cssSelector(pr.getProperty("FB_createaccount")));
    createNewAccount.click();
    
    Thread.sleep(3000);
    WebElement Name=driver.findElement(By.name(pr.getProperty("fb_name")));
    Name.sendKeys("Lovely");
    WebElement Surname=driver.findElement(By.name(pr.getProperty("fb_lastname")));
    Surname.sendKeys("Sharma");
    WebElement Email=driver.findElement(By.name(pr.getProperty("fb_email")));
     Email.sendKeys("lovely.sharma@gmail.com");
    WebElement password=driver.findElement(By.cssSelector(pr.getProperty("fb_password")));
     password.sendKeys("123456");
     
     
     //dateodbirth selection
     WebElement DateOfBirth=driver.findElement(By.id(pr.getProperty("fb_dayselection")));
     dropdownhandle.dropDowByIndex(DateOfBirth, 9);
     
     Thread.sleep(3000);
     WebElement Month=driver.findElement(By.name(pr.getProperty("fb_birthdaymonth")));
     dropdownhandle.dropDowByValue(Month, "10");
     
     Thread.sleep(3000);
     WebElement year=driver.findElement(By.name(pr.getProperty("fb_birthdayyear")));
     dropdownhandle.dropDowByVisibletext(year, "2008");
   
     //Genderselection
     WebElement Genderselection=driver.findElement(By.cssSelector(pr.getProperty("fb_gendrselection")));
     Genderselection.click();
     
     WebElement signup=driver.findElement(By.name(pr.getProperty("fb_submit")));
     signup.click();
}
}
