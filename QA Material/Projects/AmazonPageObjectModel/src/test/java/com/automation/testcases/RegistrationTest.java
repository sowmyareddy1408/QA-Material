package com.automation.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.baseClass.BaseClass;
import com.automation.pageObjects.RegistrationPage;

public class RegistrationTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void verifyRegistrationSuccess() throws InterruptedException {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.registerToApplication("sowmya7817@gmail.com", "sowmya7817@gmail.com", "sowmya@7817", "sowmya@7817");
	}

	@AfterTest
	public void endTest() throws InterruptedException {
		driver.close();
	}

}
