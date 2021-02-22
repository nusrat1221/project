package com.bit.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import repository.ObjectRepository;
import utility.Helper;

public class Core {
	//performing action on each element 

	public void searchOnTarget(WebDriver driver) {
		Helper.typeOnElement(driver, ObjectRepository.searchTextBox, ObjectRepository.tshirt);

	}
	public void clickOnCrew(WebDriver driver) {
		Helper.clickOnElement(driver, ObjectRepository.crewshirt);
	}
	
}
