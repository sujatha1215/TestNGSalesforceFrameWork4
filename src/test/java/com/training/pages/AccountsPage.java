package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class AccountsPage extends BasePage{

	

	public AccountsPage(WebDriver driver) {
		 super(driver);
	 }
	
	
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement _newAccountButton;
	
	@FindBy(xpath="//*[@id=\"acc2\"]")
	WebElement _accountNameTextBox;
	
	@FindBy(xpath="//*[@id=\"acc6\"]")
	WebElement _selectType;
	
	@FindBy(xpath="//*[@id=\"00NDn000006w7cK\"]")
	WebElement _customerPriority;
	
	@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[1]")
	WebElement _saveNewAccount;
	
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
	WebElement _createNewView;
	
	@FindBy(xpath="//*[@id=\"fname\"]")
	WebElement _viewNameTextBox;
	
	@FindBy(xpath="//*[@id=\"devname\"]")
	WebElement _viewUniqueNameTextBox;
	
	
	@FindBy(xpath="//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	WebElement _saveNewViewButton;
	
	public void saveNewViewLink()
	{
		waitForElement(20,_saveNewViewButton);
		_saveNewViewButton.click();
	}
	
	public void EnterViewUniqueName()
	{
		waitForElement(20,_viewUniqueNameTextBox);
		_viewUniqueNameTextBox.sendKeys("ABCD");
		
	}
	
	public void EnterViewName()
	{
		waitForElement(20,_viewNameTextBox);
		_viewNameTextBox.sendKeys("abcd");
		
	}
	
	
	
	
	public void CreateViewLink()
	{
		waitForElement(20,_createNewView);
		_createNewView.click();
	}
	
	@FindBy(xpath="//*[@id=\"fcf\"]")//
	WebElement _viewNameDropDownBox;
	
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")
	WebElement _editViewButton;
	
	@FindBy(xpath="//*[@id=\"fname\"]")
	WebElement _newViewName;
	
	@FindBy(xpath="//*[@id=\"fcol1\"]")
	WebElement _fieldDropDown;
	
	@FindBy(xpath="//*[@id=\"fop1\"]")
	WebElement _operatorDropDown;
	
	@FindBy(xpath="//*[@id=\"fval1\"]")
	WebElement _valueTextBox;
	
	@FindBy(xpath="//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	WebElement _editViewSaveButton;
	
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
	WebElement _mergeAccounts;
	
	@FindBy(xpath="//*[@id=\"srch\"]")
	WebElement _searchAccount;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")
	WebElement _findAccounts;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[1]")
	WebElement _firstRadioButton;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]")
	WebElement _secondRadioButton;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[3]")
	WebElement _thirdRadioButton;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")
	WebElement _mergeButton;
	
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")
	WebElement _clickNext;
	
	
	//TestCase14
	
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")
	WebElement _lastActivityLink;
	
	public void ClickLastActivityLink()
	{
		waitForElement(20,_lastActivityLink);
		_lastActivityLink.click();
	}
	
	@FindBy(xpath="//*[@id=\"ext-gen278\"]/div[3]")
	WebElement _createDateInDropDown;
	
	@FindBy(xpath="//*[@id=\"ext-gen152\"]")
	WebElement _fromDatelink;
	
	@FindBy(xpath="//*[@id=\"ext-gen298\"]")
	WebElement _selectFromDate;
	
	@FindBy(xpath="//*[@id=\"ext-gen154\"]")
	WebElement _toDateLink;
	
	@FindBy(xpath="//*[@id=\"ext-gen317\"]")
	WebElement _selectToDate;
	
	@FindBy(xpath="//*[@id=\"ext-gen49\"]")
	WebElement _saveButton;
	
	@FindBy(xpath="//*[@id=\"saveReportDlg_reportNameField\"]")
	WebElement _reportName;
	
	@FindBy(xpath="//*[@id=\"saveReportDlg_DeveloperName\"]")
	WebElement _reportUniqueName;
	
	@FindBy(xpath="//*[@id=\"ext-gen340\"]")
	WebElement _saveAndRunButton;
	
	//waitForElement(20,);
	public void ClickSaveAndRunButton()
	{
		waitForElement(20,_saveAndRunButton);
		_saveAndRunButton.click();
	}
	public void enterReportuniqueName()
	{
		waitForElement(20,_reportUniqueName);
		_reportUniqueName.sendKeys("xyz123");
	}

	
	public void enterReportName()
	{
		waitForElement(20,_reportName);
		_reportName.sendKeys("xyz123");
	}
	
	public void ClickSaveButton()
	{
		waitForElement(20,_saveButton);
		_saveButton.click();
	}
	
	public void ToDateLink()
	{
		waitForElement(20,_toDateLink);
		_toDateLink.click();
	}
	
	public void selectToDateLink()
	{
		waitForElement(20,_selectToDate);
		_selectToDate.click();
	}
	
	
	public void FromDateLink()
	{
		waitForElement(20,_fromDatelink);
		_fromDatelink.click();
	}
	
	public void selectFromDateLink()
	{
		waitForElement(20,_selectFromDate);
		_selectFromDate.click();
	}
	public void selectCreateDate()
	{
		waitForElement(30,_createDateInDropDown);
		_createDateInDropDown.click();
	}
	public void ClickNextPage()
	{
		_clickNext.click();
	}
	
	public void ClickMergeButton() throws InterruptedException
	{
		waitForElement(20,_mergeButton);
		
		_mergeButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void FirstRadioButton()
	{
		waitForElement(20,_firstRadioButton);
		_firstRadioButton.click();
	}
	
	public void secondRadioButton()
	{
		waitForElement(20,_secondRadioButton);
		_secondRadioButton.click();
	}
	
	public void thirdRadioButton()
	{
		waitForElement(20,_thirdRadioButton);
		_thirdRadioButton.click();
	}
	public void findMergeAccounts()
	{
		waitForElement(20,_findAccounts);
		_findAccounts.click();
	}
	
	public void searchMergeAccount()
	{
		waitForElement(20,_searchAccount);
		_searchAccount.sendKeys("Account");
	}
	
	public void ClickMergeAccounts()
	{
		waitForElement(20,_mergeAccounts);
		_mergeAccounts.click();
	}
	public void EditSaveButton()
	{
		_editViewSaveButton.click();
	}
	public void EnterIntoValueText()
	{
		_valueTextBox.sendKeys("a");
	}
	
	public void OperatorDropDown()
	{
		waitForElement(20,_operatorDropDown);
		
		Select sel=new Select(_operatorDropDown);
		sel.selectByValue("c");
		_operatorDropDown.click();
	
	}
	
	public void FieldDropDown()
	{
		waitForElement(20,_fieldDropDown);
		
		Select sel=new Select(_fieldDropDown);
		sel.selectByValue("ACCOUNT.NAME");
		_fieldDropDown.click();
	
	}
	
	
	public void EnterNewViewName()
	{
		waitForElement(20,_newViewName);
		_newViewName.sendKeys("AKM_Account101");
	}
	
	public void ViewEditButton()
	{
		waitForElement(20,_editViewButton);
		_editViewButton.click();
	}
	
	
	public void saveButton()
	{
		waitForElement(20,_saveNewAccount);
		_saveNewAccount.click();
	}
	public void viewDropDown()
	{
		waitForElement(30,_viewNameDropDownBox);
		
		Select sel=new Select(_viewNameDropDownBox);
		sel.selectByValue("00BDn000004h4PK");
		_viewNameDropDownBox.click();
		
		
	}
	/*
	public void CreateView()
	{
		waitForElement(20,_createNewView);
		
		Select sel=new Select(_createNewView);
		sel.selectByValue("AKM_Account");
		_createNewView.click();
	}
	*/
	public void SelectType()
	{
		waitForElement(20,_selectType);
		_selectType.click();
		Select sel=new Select(_selectType);
		sel.selectByValue("Technology Partner");
	}
	
	public void CustomerPriority()
	{
		waitForElement(20,_customerPriority);
		_customerPriority.click();
		Select customerPriority=new Select(_customerPriority);
		customerPriority.selectByValue("High");
	}
	
	public void newAccountTab()
	{
		waitForElement(20,_newAccountButton);
		_newAccountButton.click();
	}
	
	public void AccountNameTextBox()
	{
		waitForElement(20,_accountNameTextBox);
		_accountNameTextBox.sendKeys("lakshmi");
	}
}
