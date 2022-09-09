package org.testing.Testscripts.YTFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.pages.login;
import org.testing.pages.logout;
import org.testing.utilities.logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_2 extends base {

	@Test
	public void History() throws InterruptedException {
		login Login=new login(driver,pr);
		Login.signin("kirtiyt27@gmail.com", "Diamond$152");
		
		WebElement History=driver.findElement(By.xpath(pr.getProperty("TC_2_Histoy")));
		History.click();
		
		logs.takeLogs("TC_2", "clicked on History link");
		Thread.sleep(4000);
		
		logout log=new logout(driver,pr);
		log.signingout();
		
			
	}
}
