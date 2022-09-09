	package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	ChromeDriver driver;
	Properties pr;
	
	public login(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
	}
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
	}

}
