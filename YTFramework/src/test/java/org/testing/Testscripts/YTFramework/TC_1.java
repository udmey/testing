package org.testing.Testscripts.YTFramework;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assert1;
import org.testing.base.base;

import org.testing.pages.login;
import org.testing.pages.logout;
import org.testing.utilities.logs;
import org.testing.utilities.screenshotcapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_1 extends base {
	@Test
	public void loginyt() throws InterruptedException, IOException {
		
		String expectedURL="https://www.youtube.com/";
		
		login Login=new login(driver,pr);
		Login.signin("kirtiyt27@gmail.com", "Diamond$152");
		System.out.println(driver.getCurrentUrl());
		
		Assert1.assertion(driver.getCurrentUrl(), expectedURL);
		//Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
		logs.takeLogs("TC_1", "Login is successfull");
		
		WebElement Explore=driver.findElement(By.xpath(pr.getProperty("TC_1_Explore")));
		Explore.click();
		Thread.sleep(2000);
		logs.takeLogs("TC_1", "clicked on email");
		
		WebElement Trending=driver.findElement(By.xpath(pr.getProperty("TC_1_Trending")));
		Trending.click();
		Thread.sleep(2000);
		screenshotcapture.takescreenshot(driver, "../YTFramework/target/screenshots");
		logs.takeLogs("TC_1", "clicked on trending link");
		
		logout log=new logout(driver,pr);
		log.signingout();
		
		screenshotcapture.takescreenshot(driver, "E:\\screenshot\\passedscenarios\\screenshots.png");
		
	}

}
