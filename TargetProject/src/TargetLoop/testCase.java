package TargetLoop;

import org.openqa.selenium.WebDriver;

import Weatherloop.WeatherObjRep;

public class testCase {
	
	public void testSceneOne() throws InterruptedException {
		
	BaseTest1 t1= new BaseTest1();
	WebDriver dr = t1.openbrowser(TargetObjectRep.url);
	Action a = new Action(dr);
	a.clickOn(TargetObjectRep.deals);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.dealsClearance);
	Thread.sleep(15000);
	a.clickOn(TargetObjectRep.shoesClearance);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.firstShoe);
	Thread.sleep(5000);
	a.shoePrice(TargetObjectRep.oneShoePrice);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.clickquantityIncrease);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.increaseToTwoShoes);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.ShipIt);
	Thread.sleep(5000);
	a.clickOn(TargetObjectRep.viewCart);
	Thread.sleep(5000);
	a.verifyPricedouble(TargetObjectRep.twoShoeSubtotal, TargetObjectRep.oneshoe);
	Thread.sleep(5000);
	a.changeQuantityToOne(TargetObjectRep.changeQuantity, TargetObjectRep.shoeValue);
	Thread.sleep(5000);
	//a.verifyShoePricechangeToOne(x, z);
	t1.closeBroswer();
	
	
	
	
	}
	
	public void testScenetwo() throws InterruptedException {
		BaseTest1 t1= new BaseTest1();
		WebDriver dr1 = t1.openbrowser(WeatherObjRep.weatherURL);
		Action a = new Action(dr1);
		Thread.sleep(5000);
		a.search(WeatherObjRep.searchBox, WeatherObjRep.zipCode);
		a.clickOn(WeatherObjRep.selectBronx);
		Thread.sleep(5000);
		a.getTempValue(WeatherObjRep.temperature);
		
	}

}
