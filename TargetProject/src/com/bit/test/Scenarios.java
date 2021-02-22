package com.bit.test;

import org.openqa.selenium.WebDriver;

import com.bit.step.Core;

public class Scenarios {

	public void searchCrew() {
		BaseTest b = new BaseTest();
		WebDriver dr = b.OpenBrowser();
		Core c = new Core();
		c.searchOnTarget(dr);
		c.clickOnCrew(dr);
	}

	public void createAccount() {
		/*
		 open browser 
		 go to target.com
		 verify logo
		 verify title 
		 click on signIn icon 
		 click on create acount 
		 verify signup page title
		 verify header text as " "
		 */
		BaseTest b = new BaseTest();
		WebDriver dr = b.OpenBrowser();
		Core c = new Core();
	}
}
