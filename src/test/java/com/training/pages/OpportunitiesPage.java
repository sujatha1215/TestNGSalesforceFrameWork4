package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OpportunitiesPage extends BasePage{

	public OpportunitiesPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id=\"Opportunity_Tab\"]/a")
	WebElement _opportunityTab;
	
	@FindBy(xpath="//*[@id=\"fcf\"]")
	WebElement _viewDropDown;
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")
	WebElement _opptPipeLine;
	
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")
	WebElement _stuckOppty;
	
	@FindBy(xpath="//*[@id=\"quarter_q\"]")
	WebElement _intervalCurrentFQ;
	
	@FindBy(xpath="//*[@id=\"open\"]")
	WebElement _includeAllOppty;
	
	
	@FindBy(xpath="//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input")
	WebElement _runReport;
	
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement _newOpptyButton;
	
	@FindBy(xpath="//*[@id=\"opp3\"]")
	WebElement _opptyName;
	
	
	
	public void enterOpptyName()
	{
		waitForElement(20,_opptyName);
		_opptyName.sendKeys("asdf");
	}
	public void NewOpptyButton()
	{
		_newOpptyButton.click();
	}
	public void SelectRunReport()
	{
		waitForElement(20,_runReport);
		_runReport.click();
	}
	public void selectAlloppty()
	{
		waitForElement(20,_includeAllOppty);
		Select selAllOppty=new Select(_includeAllOppty);
		selAllOppty.selectByValue("all");
		/*List<WebElement>allOpportunity=selFQ.getOptions();
		for(WebElement option:allOpportunity)
		{
System.out.println(option.getText());
		}*/
	}
	
	public void selectCurrentFQ()
	{
		waitForElement(20,_intervalCurrentFQ);
		
		Select selFQ=new Select(_intervalCurrentFQ);
		selFQ.selectByValue("curnext1");
		/*List<WebElement>allOpportunity=selFQ.getOptions();
		for(WebElement option:allOpportunity)
		{
System.out.println(option.getText());
		}*/
	}
	public void ClickStuckOppty()
	{
		waitForElement(20,_stuckOppty);
		_stuckOppty.click();
	}
	
	
	public void ClickOpptyPipeLine()
	{
		waitForElement(20,_opptPipeLine);
		_opptPipeLine.click();
	}
	
	public void ViewDropDown()
	{
		waitForElement(20,_viewDropDown);
		
		Select sel=new Select(_viewDropDown);
		List<WebElement>allOpportunity=sel.getOptions();
		for(WebElement option:allOpportunity)
		{
System.out.println(option.getText());
		}
	}
	public void OpportunityTab()
	{
		_opportunityTab.click();
	}
	
	
}
