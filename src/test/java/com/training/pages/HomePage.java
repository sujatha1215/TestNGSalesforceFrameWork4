package com.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class HomePage  extends BasePage{
	
	
	public HomePage(WebDriver driver) {
		 super(driver);
	 }
	
	@FindBy(xpath="//*[@id=\"userNav\"]")
	WebElement _userName;
	
	@FindBy(id="name")
	WebElement Name;
	
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
	WebElement _logOutButton;
	
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]")
	WebElement _developerConsoleLink;
	
	@FindBy(xpath="//*[@id=\"Account_Tab\"]/a")
	WebElement _accountsLink;
	
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement _newAccountButton;
	
	
	
	public void newButton()
	{
		_newAccountButton.click();
	}
	public void logout()
	{
		waitForElement(10,_logOutButton);
		_logOutButton.click();
	}
	
	public void developerconsoleclick()
	{
		_developerConsoleLink.click();
		//driver.switchTo().window();
	}
	
	public void accountsTab()
	{
		_accountsLink.click();
	}
	
	List<WebElement> userMenuList=driver.findElements(By.xpath("//*[@id=\"userNav-menuItems\"]"));
	
	public void userMenuListItems()
	{
		for(WebElement userMenu:userMenuList)
		{
			System.out.println(userMenu.getText());
		}
	}
	public void clickUserName() {
		waitForElement(10,_userName);
		_userName.click();
		System.out.println("hello");
		userMenuListItems();
		// _userName.getText();
		
	}
	
	
//	public  void enterIntoName(String fName) {
//		Name.sendKeys(fName);
//	}
	
}
