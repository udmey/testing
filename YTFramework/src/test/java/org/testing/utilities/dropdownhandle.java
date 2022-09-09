package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandle {

	public static void dropDowByIndex(WebElement el,int index) {
		Select s=new Select(el);
		s.selectByIndex(index);
		
	}
	public static void dropDowByVisibletext(WebElement el,String visibletext) {
		Select s=new Select(el);
		s.selectByVisibleText(visibletext);
	}
	public static void dropDowByValue(WebElement el,String value) {
		Select s=new Select(el);
		s.selectByValue(value);
		
	}
	
	
}
