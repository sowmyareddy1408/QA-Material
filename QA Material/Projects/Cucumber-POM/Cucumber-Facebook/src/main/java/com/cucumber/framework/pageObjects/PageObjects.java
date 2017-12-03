package com.cucumber.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.Base.BaseClass;

public class PageObjects extends BaseClass {
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement pass;
	
	@FindBy(xpath=("//*[@type='submit']"))
	WebElement login;
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void details(String emailId,String password){
		email.sendKeys(emailId);
		pass.sendKeys(password);
		}
	
	public void submit(){
    	login.click();
	}
}
