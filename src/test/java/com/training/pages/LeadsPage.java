package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPage extends BasePage {

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id=\"Lead_Tab\"]/a")
	WebElement _leadsButton;
	
	@FindBy(xpath="//*[@id=\"fcf\"]")
	WebElement _selectViewDropDown;
	
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[1]/input")
	WebElement _goButton;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
	WebElement _logout;
	public void LogoutButton()
	{
		waitForElement(20,_logout);
		_logout.click();
	}
	public void ClickGobutton()
	{
		waitForElement(20,_goButton);
		_goButton.click();
	}
	
	public void selectTodaysLeads()
	{
		waitForElement(20,_selectViewDropDown);
		Select sel=new Select(_selectViewDropDown);
		sel.selectByValue("00BDn000004co2f");
	}
	public void selectMyUnreadLeads()
	{
		waitForElement(20,_selectViewDropDown);
		Select sel=new Select(_selectViewDropDown);
		sel.selectByValue("00BDn000004co2R");
	}
	public void selectDropDownView()
	{
		waitForElement(20,_selectViewDropDown);
		Select sel=new Select(_selectViewDropDown);
		List<WebElement>viewDropDown=sel.getOptions();
		for(WebElement option:viewDropDown)
		{
System.out.println(option.getText());
		}
	}
	
	public void selectLeads()
	{
		_leadsButton.click();
	}
}
