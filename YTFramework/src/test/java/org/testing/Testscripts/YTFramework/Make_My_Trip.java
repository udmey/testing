package org.testing.Testscripts.YTFramework;

	import java.util.List;

	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Make_My_Trip 
	{
		static WebDriver driver;
		@Test
		public void abc() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			
		}
		
		@Test
		public  void xyz() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();	//will disappear the login options	
			driver.findElement(By.cssSelector("input[data-cy='fromCity']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@*='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("t");
			Thread.sleep(4000);
			Actions ac = new Actions(driver);
			//p[contains(text(),'Tampico')]
			Thread.sleep(2000);
		   List<WebElement> fr =	driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		   String val, city="Tanna";
		   int j = fr.size();
		   int i = 0;
		  while(i<=j)
		  {
			 val = driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value");
			 if(city.equalsIgnoreCase(val))
			 {
				ac.sendKeys(Keys.ENTER).perform(); 
				break;
			 }
			 else
			 {
				 Thread.sleep(2000);
				 ac.sendKeys(Keys.ARROW_DOWN).perform();
			 }
			  i++;
		  }
		
			
		}

	}

