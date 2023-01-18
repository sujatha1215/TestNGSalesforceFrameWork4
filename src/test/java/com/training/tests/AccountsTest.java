package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountsPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountsTest extends BaseTest{

	
	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String email;
	String password;
	LoginPage login;
	HomePage home;
	AccountsPage account;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver("chrome");
		driver.get(url);
		login=new LoginPage(driver);
		home=new HomePage(driver);
		account=new AccountsPage(driver);
	}
	

	//TestCase
	@Test
	public void NewAccountButtonTC10() throws InterruptedException
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		
		account.newAccountTab();
		account.AccountNameTextBox();
		account.SelectType();
		account.CustomerPriority();
		account.saveButton();
			
	}
	
	@Test
	public void CreateNewViewTC11()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		account.CreateViewLink();
		account.EnterViewName();
		account.EnterViewUniqueName();
		account.saveNewViewLink();
	}
	
	@Test
	public void EditViewNameTC12()
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		account.viewDropDown();
		account.ViewEditButton();
		account.FieldDropDown();
		account.OperatorDropDown();
		account.EnterIntoValueText();
		account.EditSaveButton();
	}
	
	@Test
	public void MergeAccountsTC13() throws InterruptedException
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		account.ClickMergeAccounts();
		account.searchMergeAccount();
		account.findMergeAccounts();
		account.FirstRadioButton();
		account.secondRadioButton();
		account.thirdRadioButton();
		account.ClickNextPage();
		account.ClickMergeButton();
	}
	
	
	@Test
	public void CreateReportTC14()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		home.accountsTab();
		account.ClickLastActivityLink();
		account.selectCreateDate();
		account.FromDateLink();
		account.selectFromDateLink();
		account.ToDateLink();
		account.selectToDateLink();
		account.saveButton();
		account.enterReportName();
		account.enterReportuniqueName();
		account.ClickSaveAndRunButton();
		
		
	}
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver);
		driver.close();
	}

	
	
	
}
