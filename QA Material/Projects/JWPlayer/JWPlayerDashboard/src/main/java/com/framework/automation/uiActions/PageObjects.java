package com.framework.automation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.apache.log4j.Logger;

import com.framework.automation.testbase.TestBase;

public class PageObjects extends TestBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	@FindBy(id = "email")
	WebElement email;

	@FindBy(xpath = "//*[@type='password']")
	WebElement password;

	@FindBy(id = "submit_login")
	WebElement submit;

	@FindBy(xpath = "//*[@id='fouc']/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/a")
	WebElement link;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/a")
	WebElement player;

	@FindBy(id = "player-name")
	WebElement nameOfPlayer;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div/ng-include/ng-form/div[2]/div[3]/jw-dropdown/div[1]/a")
	WebElement dropDown;

	@FindBy(className = "dropdown-menu")
	List<WebElement> aspectRatio;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/button[2]")
	WebElement save;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/button[1]")
	WebElement close;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/a")
	WebElement verifyName;

	@FindBy(xpath = "//*[@id='fouc']/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]")
	WebElement verifySize;

	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void applicationFlow(String userEmail, String userPassword, String playerName) {
		email.sendKeys(userEmail);
		log.info("entered email: " + userEmail + " and object is " + email.toString());
		password.sendKeys(userPassword);
		log.info("entered password: " + userPassword + " and object is " + password.toString());
		submit.click();
		log.info("clicked on signIn button and the object is: " + submit.toString());
		link.click();
		log.info("clicked on Player's link and the object is: " + link.toString());
		player.click();
		log.info("clicked on name of an example Player and the object is: " + player.toString());
		nameOfPlayer.clear();
		log.info("cleared the text box");
		nameOfPlayer.sendKeys(playerName);
		log.info("entered Test Player 1 as player name");
		dropDown.click();
		log.info("clicked on dropDown");
		aspectRatio.get(0).click();
		log.info("selecting aspectRatio as 4:3 from dropDown");
		save.click();
		log.info("saving all changes made");
		close.click();
		log.info("closing player builder page");
	}

	public String getName() {
		log.info("getting value of player and the object is: " + verifyName.toString());
		return verifyName.getText();
	}

	public String getSize() {
		log.info("getting value of size and the object is: " + verifySize.toString());
		return verifySize.getText();
	}
}
