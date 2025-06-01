package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author HP1
 * 
 * This class  will capture screenshot and embed it in cucumber report
 *
 */
public class CaptureScreenshot {
	
	
	
	/**
	 * @param driver
	 * @return
	 * 
	 * 		This method will capture screenshot and return it in byte format
	 *         to embed in cucumber report
	 * 
	 */
	public static byte[] captureImage(WebDriver driver) {

		TakesScreenshot srcShot = (TakesScreenshot) driver;

		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);

		return srcFile;

	}

}
