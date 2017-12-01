package com.framework.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.framework.automation.testbase.TestBase;
import com.framework.automation.uiActions.PageObjects;

public class TC001_automateJWPlayerDashboard extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_automateJWPlayerDashboard.class.getName());

	@BeforeClass
	public void setUp() {
		init();
	}

	@Test
	public void automateJWPlayerDashboard() {
		log.info("********** Starting automateJWPlayerDashboard Test **********");
		PageObjects pg = new PageObjects(driver);
		pg.applicationFlow("sowmya7817@gmail.com", "Sowmya@7817", "Test Player 1");
		Assert.assertEquals("Test Player 1", pg.getName());
		Assert.assertEquals("4:3", pg.getSize());
		log.info("********** Finished automateJWPlayerDashboard Test **********");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
