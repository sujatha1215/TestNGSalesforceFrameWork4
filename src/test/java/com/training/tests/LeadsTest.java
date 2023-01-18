package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;

import com.training.utilities.CommonUtilities;

public class LeadsTest extends BaseTest{

	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String email;
	String password;
	LoginPage login;
	HomePage home;
	LeadsPage leads;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver("chrome");
		driver.get(url);
		login=new LoginPage(driver);
		home=new HomePage(driver);
		leads=new LeadsPage(driver);
	
	}
	
	@Test
	public void TC20LeadsTab()
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		leads.selectLeads();
	}
	
	
	@Test
	public void TC21leadsSelectView()
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		leads.selectLeads();
		leads.selectDropDownView();
	}
	@Test
	public void TC22DefaultView() throws InterruptedException
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		leads.selectLeads();
		leads.selectMyUnreadLeads();
		leads.ClickGobutton();
		
		home.logout();
		
	}
	
	@Test
	public void TodaysLeadTC23()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		leads.selectLeads();
		leads.selectTodaysLeads();
	}
	
	@AfterMethod
	public void teardown() 
	
	{
		takescreenshot(driver);
		driver.close();
	}
}
