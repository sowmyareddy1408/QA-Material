package com.cucumber.framework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;
	String browser = "chrome";
	String url = "https://www.facebook.com/";
	
	public void init() {
		selectBrowser(browser);
		getUrl(url);
	}

	public void selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
}
