package com.training.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class RandomScenariosPage extends BasePage{

	public RandomScenariosPage(WebDriver driver) {
		 super(driver);
	 }
	
	@FindBy(xpath="//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
	WebElement _userprofileNamedisplay;
	
	@FindBy(xpath="//*[@id=\"home_Tab\"]/a")
	WebElement _clickHomeTab;
	
	@FindBy(xpath="//*[@id=\"mru005Dn0000018y4g\"]/a/span")
	WebElement _clickProfileName;
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	WebElement _clickeditProfileicon;
	
	@FindBy(xpath="//li[@id='aboutTab']")
	WebElement _clickabout;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement _LastNameTextBox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
	WebElement _clickSaveall;
	
	@FindBy(xpath="//*[@id=\"AllTab_Tab\"]/a/img")
	WebElement _clickPlusSign;
	
	@FindBy(xpath="//input[@title='Customize My Tabs']")
	WebElement _clickcustomiseTab;
	
	@FindBy(xpath="//*[@id=\"duel_select_1\"]/option[7]")
	WebElement _selectedTab;
	
	@FindBy(xpath="//*[@id=\"duel_select_0_left\"]/img")
	WebElement _clickRemove;
	
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement _clickSaveButton;
	
	public void ClickSave()
	{
		waitForElement(10,_clickSaveButton);
		_clickSaveButton.click();
	}
	
	public void clickRemoveButton()
	{
		waitForElement(10,_clickRemove);
		_clickRemove.click();
	}
	
	public void selectTab()
	{
		waitForElement(10,_selectedTab);
		_selectedTab.click();
	}
	
	public void ClickCustomizeTab()
	{
		waitForElement(10,_clickcustomiseTab);
		_clickcustomiseTab.click();
	}
	public void ClickAllTabsArrow()
	{
		waitForElement(10,_clickPlusSign);
		_clickPlusSign.click();
	}
	
	public void ClickSaveAll()
	{
		waitForElement(10,_clickSaveall);
		_clickSaveall.click();
	}
	public void EnterlastName()
	{
		waitForElement(10,_LastNameTextBox);
		_LastNameTextBox.sendKeys("QWQW");
		
	}
	
	public void getwindowhandlelist1()
	 {
		 System.out.println(driver.getWindowHandles());
	 }
	 public void switchToframe() throws InterruptedException
	 {
		// String parent=driver.getWindowHandle();
		 String homepage = driver.getWindowHandle();
		 System.out.println("homepage is displayed");
		 _clickeditProfileicon.click();
		  Thread.sleep(3000);
		driver.switchTo().frame("contactInfoContentId");
		_clickabout.click();

		 }
		
	/*public void changeWindow()
	{
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a")).click();
	}*/
	public void ClickeditIcon()
	{
		waitForElement(10,_clickeditProfileicon);
		_clickeditProfileicon.click();
	}
	public void ClickProfileName()
	{
		
		waitForElement(10,_clickProfileName);
		_clickProfileName.click();
	}
	public void ClickHomeTab()
	{
		waitForElement(10,_clickHomeTab);
		_clickHomeTab.click();
	}
	public void ClickUserProfileName()
	{
		waitForElement(10,_userprofileNamedisplay);
		_userprofileNamedisplay.click();
	}
	
}
