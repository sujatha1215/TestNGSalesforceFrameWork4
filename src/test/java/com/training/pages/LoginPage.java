package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	
	 public LoginPage(WebDriver driver) {
		 super(driver);
	 }
	
	
		@FindBy(id="username")
		WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(id="Login")
		WebElement loginButton;
		
		@FindBy(xpath="//label[contains(text(),'Remember me')]")
		WebElement rememberMeCheckBox;
		
		@FindBy(id="userNavLabel")
		WebElement UserDropDown;
		
		@FindBy(xpath="//a[@title='Logout']")
		WebElement LogOut;
		
		
		@FindBy(id="forgot_password_link")
		WebElement ForgotPassword;
		
		
		@FindBy(id="un")
		WebElement Forgot_UserNameTextBox;
		
		
		@FindBy(id="continue")
		WebElement ContinueButton;
		//First Testcase
			
		
		@FindBy(xpath="//*[@id=\"error\"]")
		WebElement errorMessage;
	
	public void enterIntoEmail(String stremail) {
		waitForElement(20,email);
		email.sendKeys(stremail);
	}
	
	
	public void enterIntoPassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	
	//TestCase 4(b)
	
	public void enterIncorrectEmail(String stremail) {
		//waitForElement(20,Incorrectemail);
		email.sendKeys(stremail);
	}
	
	
	
	public void enterInCorrectPassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	//First Test Case
	
	public void clearPassword()
	{
		password.clear();
	}
	
	//Third Test case
	
	public void rememberme()
	{
		rememberMeCheckBox.click();
	}
	
	
	//Fourth Test Case
	
	public void UserDropDownMenu()
	{
		UserDropDown.click();
	}
	
	
	public void ForgotPasswordClick()
	{
		ForgotPassword.click();
	}
	
	public void ForgotUserNameTextBox(String UserName)
	{
		Forgot_UserNameTextBox.sendKeys(UserName);
	}
	
	public String errorMessageDisplay()
	{
		return errorMessage.getAttribute("text");
	}
	
	public void ForgotUsername_ContinueButton()
	{
		ContinueButton.click();
	}
	public void LogOutClick()
	{
		LogOut.click();
	}
	public void clickOnLogin() {
		loginButton.click();
	}
	
	
	
}
