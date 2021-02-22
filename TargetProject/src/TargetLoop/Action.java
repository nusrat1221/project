package TargetLoop;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Action {

	WebDriver dr;
	public Action (WebDriver a) {
		dr=a;
	}
	public void search(By x, String y) {
		dr.findElement(x).sendKeys(y);
	}
	public void getTempValue(By x) {
		String currentTemp =dr.findElement(x).getText();
		System.out.println("The current temperature is " + currentTemp + " degree.");
		String TempNum=currentTemp.replace("°", "");
		double a = Double.parseDouble(TempNum);
		if (a<50&&a>20) {
			System.err.println("The Current Temp is between 20 degree and 50 degree.");
			
		}
		else {
			System.out.println("The Temp is not between 20-50 degree.");
		}
	}
	
	
	public void waitToLoad() {
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void clickOn(By x) {
		dr.findElement(x).click();
		
	}
	public void shoePrice(By x) {
		String e = dr.findElement(x).getText();
		System.out.println("The shoe price is " + e);
	}

	public void verifyPricedouble(By x, String s) {
		String Twoshoes = dr.findElement(x).getText();
		String oneshoe = s;
		System.out.println("The price of two shoes are " + Twoshoes);
		
		double oneshoes = Double.parseDouble(oneshoe.replace("$", ""));
		double twoshoe = Double.parseDouble(Twoshoes.replace("$", ""));
		if (oneshoes*2==twoshoe) {
			System.out.println("the shoe price has changed");
			
		}else if (oneshoes==twoshoe){
			System.out.println("the shoe price is same");
		}else {
			System.out.println("the shoe price has not doubled but is also not the same");
		}
	}
	public void changeQuantityToOne(By x, String a) {
		new Select( dr.findElement(x)).selectByVisibleText(a);;
		
	}
	public void verifyShoePricechangeToOne(By x, By z) {
		String Twoshoess = dr.findElement(x).getText();
		String oneShoess =  dr.findElement(z).getText();
		if (Twoshoess==oneShoess) {
		System.out.println("The Price has not changed back " );}
		else {
			System.out.println("The price has changed back to one");
		}
		
	}
	public void verifyMenuText(){
		
	}
	

}
