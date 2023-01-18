package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.training.utilities.Constants.USER_DIR;
import static com.training.utilities.Constants.FILE_SEPARATOR;
import static com.training.utilities.Constants.SCREENSHOT_PATH;

public class BaseTest {
	
	private WebDriver driver;
	
	public WebDriver getDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		 	WebDriverManager.firefoxdriver().setup();
		 	driver = new FirefoxDriver();
		}
		return driver;
		
	}
	public void takescreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		
		
		Date currentDate=new Date();
		String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);  
		
		
	/*	String fileSeparator=System.getProperty("file.separator");
		String reportFilePath=System.getProperty("user.dir")+fileSeparator+"ScreenShots";*/
		
		String reportFilePath=USER_DIR+FILE_SEPARATOR+SCREENSHOT_PATH;
		String fileName="Salesforce"+timeStamp+".png";
		String filepath=reportFilePath+FILE_SEPARATOR+fileName;
		 
		 File destFile=new File(filepath);
		 try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
