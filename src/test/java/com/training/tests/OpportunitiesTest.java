package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunitiesPage;
import com.training.utilities.CommonUtilities;

public class OpportunitiesTest extends BaseTest {

	
	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String email;
	String password;
	LoginPage login;
	HomePage home;
	OpportunitiesPage opportunity;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver("chrome");
		driver.get(url);
		login=new LoginPage(driver);
		home=new HomePage(driver);
		opportunity=new OpportunitiesPage(driver);
	
	}
	
	@Test(priority=1)
	 public void CheckOpportunityTabTC15()
	 {
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		opportunity.OpportunityTab();
		opportunity.ViewDropDown();
	 }
	
	@Test(priority=3)
	public void TestOpportunityPipelineReportTC18()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		opportunity.OpportunityTab();
		opportunity.ClickOpptyPipeLine();
	}
	
	
	@Test(priority=2)
	public void TestStuckOpportunitiesReportTC17()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		opportunity.OpportunityTab();
		opportunity.ClickStuckOppty();
	}
	
	@Test
	public void CreateANewOptyTC16()
	
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		opportunity.OpportunityTab();
		opportunity.NewOpptyButton();
		
	}
	@Test
	public void TestQuarterlySummaryReportTC19()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		opportunity.OpportunityTab();
		opportunity.selectCurrentFQ();
		opportunity.selectAlloppty();
		opportunity.SelectRunReport();
	}
	
	@AfterMethod
	public void teardown() 
	
	{
		takescreenshot(driver);
		driver.close();
	}
}
