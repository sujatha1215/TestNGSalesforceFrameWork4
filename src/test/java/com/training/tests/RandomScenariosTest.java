package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.RandomScenariosPage;
import com.training.utilities.CommonUtilities;

public class RandomScenariosTest extends BaseTest{
	WebDriver driver;
	String url;
	CommonUtilities common = new CommonUtilities();
	String email;
	String password;
	LoginPage login;
	HomePage home;
	RandomScenariosPage randomscenarios;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		url = common.getproperty("url");
		email = common.getproperty("email");
		password = common.getproperty("password");
		driver= getDriver("chrome");
		driver.get(url);
		login=new LoginPage(driver);
		home=new HomePage(driver);
		randomscenarios=new RandomScenariosPage(driver);
	}
	
	@Test
	public void TC_33_ClickUserProfileName()
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		randomscenarios.ClickHomeTab();
		randomscenarios.ClickUserProfileName();
		System.out.println("End Of TestCase33");
	}
	
	@Test
	public void TC_34_ClickUserProfileNameAndEdit() throws InterruptedException
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		randomscenarios.ClickHomeTab();
		randomscenarios.ClickProfileName();
		Thread.sleep(2000);
		randomscenarios.switchToframe();
		randomscenarios.EnterlastName();
		randomscenarios.ClickSaveAll();
		System.out.println("End Of TestCase34");
	}
	
	@Test
	
	public void TC_35_Verifycustomizationtab() throws InterruptedException 
	{
		login.enterIntoEmail(email);
		login.enterIntoPassword(password);
		login.clickOnLogin();
		randomscenarios.ClickAllTabsArrow();
		randomscenarios.ClickCustomizeTab();
		Thread.sleep(2000);
		randomscenarios.selectTab();
		Thread.sleep(1000);
		randomscenarios.clickRemoveButton();
		randomscenarios.ClickSave();
		Thread.sleep(2000);
		login.UserDropDownMenu();
		login.LogOutClick();
		System.out.println("End Of TestCase35");
	}
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver);
		driver.close();
	}
}
