package com.training.tests;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.ContactsPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class ContactsTest extends BaseTest{

	
	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String browser;
	String email;
	
	String password;
	LoginPage login;
	ContactsPage contacts;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		browser = common.getproperty("browser");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver(browser);
		driver.get(url);
		login = new LoginPage(driver);
		contacts=new ContactsPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	
	@Test
	public void CreateContactTC_25()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();
		contacts.newContactsTab();
		contacts.AccountNameTextBox();
		contacts.getwindowhandlelist();
		contacts.switchToframeResult();
		contacts.saveNewContact();
		System.out.println("End of TestCase25");
		
	}
	
	@Test
	public void CreateNewViewInContactPage_TC_26()
	{

		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();
		contacts.CreateNewView();
		contacts.ViewName();
		contacts.ViewUniqueName();
		contacts.SaveViewButton();
		System.out.println("End of TestCase26");
		
	}
	
	@Test
	public void TC_27_Checkrecentlycreatedcontact()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();
		contacts.RecentlyCreateDropDown();
		System.out.println("End of TestCase27");
	}
	
	
	@Test
	public void TC_28_CheckMycontacts()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();	
		contacts.SelectMycontactsViewDropdrop();
		System.out.println("End of TestCase28");
	}
	
	@Test
	public void TC_29_ViewcontactinthecontactPage()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();	
		contacts.SelectRecentContactsName();
		System.out.println("End of TestCase29");
	}
	
	@Test
	public void TC_30_ChecktheContactErrormessage()
	{
	login.enterIntoEmail(email);
	login.enterIntoPassword(password);
	login.clickOnLogin();
	contacts.ContactsTab();
	contacts.CreateNewView();
	contacts.ViewUniqueName();
	contacts.SaveViewButton();
	contacts.Errormessage();
	System.out.println("End of TestCase30");
	}
	
	@Test
	public void TC_31_CheckingCancelbutton()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();
		contacts.CreateNewView();
		contacts.ViewName1();
		contacts.ViewUniqueName1();
		contacts.CancelButton();
		contacts.ViewDropDownText();
		System.out.println("End of TestCase31");

	}
	
	@Test
	public void TC_32_CheckingSaveandNewbutton()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		contacts.ContactsTab();
		contacts.ClickNewButton1();
		contacts.EnterFirstNameTextBox();
		contacts.EnterLastNameTextBox();
		contacts.SaveAndNewButton();
		contacts.PageTitle();
		System.out.println("End of TestCase32");

	}
	
	
	@AfterMethod
	public void teardown() 
	{
		takescreenshot(driver);
		driver.close();
	}
}
