 package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseClass.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	WebElement signIn;

	@FindBy(id = "createAccountSubmit")
	WebElement createAcc;

	@FindBy(id = "ap_email")
	WebElement idEmail;

	@FindBy(name = "password")
	WebElement pswd;

	@FindBy(id = "signInSubmit")
	WebElement submit;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String emailAddress, String password) {
		signIn.click();
		idEmail.sendKeys(emailAddress);
		pswd.sendKeys(password);
		submit.click();

	}
}
