package com.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.baseClass.BaseClass;
import com.automation.pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void verifyLoginWithInvalidCredentials() {
		LoginPage hp = new LoginPage(driver);
		hp.loginToApplication("sowmya7817@gmail.com", "Sowmya@7817");
	}

	@AfterTest
	public void endTest() {
		driver.close();

	}

}
