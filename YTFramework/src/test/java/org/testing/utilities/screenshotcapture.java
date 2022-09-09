package org.testing.utilities;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotcapture {

	public static void takescreenshot(ChromeDriver driver,String path) throws IOException {
		File f= driver.getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File(path));
		
	}
}
