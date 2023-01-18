package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest extends BaseTest {
	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String email;
	String password;
	LoginPage login;
	HomePage home;
	
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver("chrome");
		driver.get(url);
		login=new LoginPage(driver);
		home=new HomePage(driver);
	
	}
	
	@Test
	public void UserMenuTC07() {
		
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.clickUserName();
		home.userMenuListItems();
		
	}
	
	
	//TestCase08
	@Test
	public void clickDeveloperConsoleTC08()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.clickUserName();
		home.developerconsoleclick();
	}
	//TestCase 09
	@Test
	public void logOutUserTabTC09() {
		

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.clickUserName();
		home.logout();
		System.out.println("Test Case09 is Success");
	
	}
	@Test
	public void AccountsTab()
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		home.newButton();
	}

	@AfterMethod
	public void teardown() {
		takescreenshot(driver);
		driver.close();
	}

}
	
