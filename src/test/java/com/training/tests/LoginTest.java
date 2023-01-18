package com.training.tests;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

//Tests - Sequence of Steps


public class LoginTest extends BaseTest{

	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String browser;
	String email;
	String IncorrectEmail;
	String IncorrectPassword;
	String password;
	LoginPage login;
	HomePage home;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		browser = common.getproperty("browser");
		email = common.getproperty("email");
		IncorrectEmail=common.getproperty("IncorrectEmail");
		IncorrectPassword=common.getproperty("IncorrectPassword");
		password = common.getproperty("password");
		driver= getDriver(browser);
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	
	// Second Test Case--Valid email and Password and click login
	@Test(priority=2)
	public void loginwithValidUsername() {
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		//home.clickHome();
	}
	
	
	//First Test Case---Enter email and clear password and click login
	
	@Test(priority=1)
	public void clearPasswordfield()
	{
		Log.info("Starting the TestCase");
		login.enterIntoEmail(email);
		login.clearPassword();
		login.clickOnLogin();
		Log.info("TestCase End");
	}
	
	
	//Third Test case
	@Test(priority=3)
	public void LogOut()
	{
		login.enterIntoEmail(email);
		login.clearPassword();
		login.enterIntoPassword(password);
		login.rememberme();
		login.clickOnLogin();
		login.UserDropDownMenu();
		login.LogOutClick();
	}
	
	
	//Test Case 4(a)
	
	@Test(priority=4)
	public void ForGotPassword()
	{
		
		login.clearPassword();
		login.ForgotPasswordClick();
		login.ForgotUserNameTextBox(email);
		login.ForgotUsername_ContinueButton();
	}
	
	
	//TestCase 4(b)
	@Test(priority=5)
	public void IncorrectUserNameAndPassword()
	{
		login.enterIncorrectEmail(IncorrectEmail);
		login.enterInCorrectPassword(IncorrectPassword);
		login.clickOnLogin();
		login.errorMessageDisplay();
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver);
		driver.close();
	}

	
	
}
