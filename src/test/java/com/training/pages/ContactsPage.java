package com.training.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;
public class ContactsPage extends BasePage{

	
	public ContactsPage(WebDriver driver) {
		 super(driver);
	}	 
		 @FindBy(xpath="//a[@title='Contacts Tab']")
			WebElement _contactsTab;
		 
		 @FindBy(xpath="//input[contains(@title,'New')]")
		 WebElement _newContactlink;
		 
		 @FindBy(xpath="//*[@id=\"name_lastcon2\"]")
		 WebElement _lastnameTextBox;
		 
		 @FindBy(xpath="//*[@id=\"con4_lkwgt\"]/img")
		 WebElement _accountNamelink;
		 
		 @FindBy(xpath="//a[normalize-space()='Accountdata11']")
		 WebElement _accountNameList;
		 
		 
		 @FindBy(xpath="//*[@id=\"resultsFrame\"]")
		 WebElement _accountnamelistframe;
		 
		 @FindBy(xpath="//*[@id=\"topButtonRow\"]/input[1]")
		 WebElement _savecontactbutton;
		 
		 @FindBy(xpath="//a[normalize-space()='Create New View']")
		 WebElement  _createnewviewTab;
		 
		 @FindBy(xpath="//input[@id='fname']")
		 WebElement _viewName;
		 
		 @FindBy(xpath="//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
		 WebElement _saveviewbutton;
		 
		 @FindBy(xpath="//select[@id='hotlist_mode']")
		 WebElement _recentlyCreatedropdown;
		 
		 @FindBy(xpath="//*[@id=\"fcf\"]")
		 WebElement _selectViewDropdown;
		 
		 @FindBy(xpath="//a[contains(text(),'ABCD')]")
		 WebElement _selectnamefromrecentcontacts;
		 
		 @FindBy(xpath="//div[@class='requiredInput']//div[@class='errorMsg']")
		 WebElement _errormessage;
		 
		 
		 @FindBy(xpath="//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")
		 WebElement _createViewCancelButton;
		 
		 @FindBy(xpath="//*[@id=\"fcf\"]")
		 WebElement _viewDropDownText;
		 
		 
		 @FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
		 WebElement _NewButtonClick;
		 
		 @FindBy(xpath="//*[@id=\"name_firstcon2\"]")
		 WebElement _FirstNameTextBox;
		 
		 @FindBy(xpath="//*[@id=\"name_lastcon2\"]")
		 WebElement _LastNameTextBox;
		 
		 @FindBy(xpath="//*[@id=\"topButtonRow\"]/input[2]")
		 WebElement _saveAndNewbutton;
		 
		 public void PageTitle()
		 {
			 System.out.println(driver.getTitle());
		 }
		 public void SaveAndNewButton()
		 {
			 waitForElement(20,_saveAndNewbutton);
			 _saveAndNewbutton.sendKeys("Indian");
		 }
		 
		 public void EnterLastNameTextBox()
		 {
			 waitForElement(20,_LastNameTextBox);
			 _LastNameTextBox.sendKeys("Global Media");
		 }
		 
		 public void EnterFirstNameTextBox()
		 {
			 waitForElement(20,_FirstNameTextBox);
			 _FirstNameTextBox.sendKeys("Indian");
		 }
		 
		 public void ClickNewButton1()
		 {
			 waitForElement(20,_NewButtonClick);
			 _NewButtonClick.click();
			 
		 }
		 
		 public void ViewDropDownText()
		 {
			 waitForElement(20,_viewDropDownText);
			 Select ViewDropDown=new Select(_viewDropDownText);
			 ViewDropDown.selectByValue("00BDn000004h4YR");
			// ViewDropDown.selectByValue("00BDn000004h4YR"));
			 
		 }
		 
		 public void CancelButton()
		 {
			 waitForElement(20,_createViewCancelButton);
			 _createViewCancelButton.click();
			 
		 }
		 
		 public void Errormessage()
		 {
			 waitForElement(20,_errormessage);
			 System.out.println(_errormessage.getText());
			 
		 }
		 
		 
		 public void SelectRecentContactsName()
		 {
			 waitForElement(20,_selectnamefromrecentcontacts);
			 _selectnamefromrecentcontacts.click();
		 }
		 public void SelectMycontactsViewDropdrop()
		 {
			 waitForElement(20,_selectViewDropdown);
			 Select selectmycontacts=new Select(_selectViewDropdown);
			 selectmycontacts.selectByVisibleText("My Contacts");
			 
		 } 
		 
		 public void RecentlyCreateDropDown()
		 {
			 waitForElement(20,_recentlyCreatedropdown);
			 Select recentCreateDropdown=new Select(_recentlyCreatedropdown);
			 recentCreateDropdown.selectByValue("2");
			 
		 }
		 
		 public void SaveViewButton()
		 {
			 waitForElement(20,_saveviewbutton);
			 _saveviewbutton.click();
		 }
		 
		 public void ViewName()
		 {
			 waitForElement(20,_viewName);
			 _viewName.sendKeys("ABCD"); 
		 }
		 
		 public void ViewName1()
		 {
			 waitForElement(20,_viewName);
			 _viewName.sendKeys("ABCD"); 
		 }
		 @FindBy(xpath="//input[@id='devname']")
		 WebElement _viewUniqueName;
		 
		 public void ViewUniqueName()
		 {
			 waitForElement(20,_viewUniqueName);
			 _viewUniqueName.sendKeys("ABCD101");
		 }
		 
		 
		 public void ViewUniqueName1()
		 {
			 waitForElement(20,_viewUniqueName);
			 _viewUniqueName.sendKeys("EFGH");
		 }
		 public void CreateNewView()
		 {
			 waitForElement(20,_createnewviewTab);
			 _createnewviewTab.click();
		 }
		 public void saveNewContact()
		 {
			 waitForElement(20,_savecontactbutton); 
			 _savecontactbutton.click();
		 }
		 
		 
		 public void getwindowhandlelist()
		 {
			 System.out.println(driver.getWindowHandles());
		 }
		 public void switchToframeResult()
		 {
			 String parent=driver.getWindowHandle();
			 Set<String>s=driver.getWindowHandles();
			 // Now iterate using Iterator
			 Iterator<String> I1= s.iterator();
			 while(I1.hasNext())
			 {

			 String child_window=I1.next();
			 if(!parent.equals(child_window))
			 {
			 driver.switchTo().window(child_window);

			 System.out.println(driver.switchTo().window(child_window));
			 waitForElement(20,_accountnamelistframe);
			 driver.switchTo().frame(driver.findElement(By.xpath("//*[@name=\"resultsFrame\"]")));
			 _accountNameList.click();
			 }

			 }
			 //switch to the parent window
			 driver.switchTo().window(parent);

			 }
			
		 
		 public void enterAccountName()
		 {
			 waitForElement(20,_accountNameList);
			 _accountNameList.click();; 
		 }
		 
		 public void AccountNameTextBox()
		 {
			 waitForElement(10,_accountNamelink);
			 _accountNamelink.click();
		 }
		  public void LastNameTextBox()
		  {
			  _lastnameTextBox.sendKeys("ABCD");
		  }
		 public void ContactsTab()
			{
			 waitForElement(10,_contactsTab);
			 _contactsTab.click();
			} 
		 public void newContactsTab()
			{
			 waitForElement(10,_newContactlink);
			 _newContactlink.click();
			} 
}
