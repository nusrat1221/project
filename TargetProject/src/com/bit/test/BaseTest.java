package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import repository.ObjectRepository;

public class BaseTest {
//open broswer page 
WebDriver driver = null;
	public WebDriver OpenBrowser() {
		if (driver == null) {
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get(ObjectRepository.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;

		

}
}
