package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.logs;

public class logout {
	ChromeDriver driver;
	Properties pr;
	
	public logout(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
	}
	public void signingout() throws InterruptedException {
		WebElement clickOnEmailIcon=driver.findElement(By.xpath(pr.getProperty("Logout1")));
		clickOnEmailIcon.click();
		Thread.sleep(3000);
		
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("Logout_2")));
		signout.click();
		Thread.sleep(2000);
		logs.takeLogs("TC_1", "logged out successfully");
	}
}


