package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseClass.BaseClass;

public class RegistrationPage extends BaseClass {
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	WebElement signIn;

	@FindBy(id = "createAccountSubmit")
	WebElement createAcc;

	@FindBy(id = "ap_customer_name")
	WebElement name;

	@FindBy(name = "email")
	WebElement userEmail;

	@FindBy(id = "ap_password")
	WebElement userPswd;

	@FindBy(id = "ap_password_check")
	WebElement pswdCheck;

	@FindBy(id = "continue")
	WebElement submitButton;

	@FindBy(id = "nav-item-signout")
	WebElement logout;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void registerToApplication(String UserName, String uEmail, String uPswd, String pCheck) {
		signIn.click();
		createAcc.click();
		name.sendKeys(UserName);
		userEmail.sendKeys(uEmail);
		userPswd.sendKeys(uPswd);
		pswdCheck.sendKeys(pCheck);
		submitButton.click();

	}

}
