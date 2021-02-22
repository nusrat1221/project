package utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	//all the action item 
	
	
	public static void clickOnElement(WebDriver driver, By b) {
		driver.findElement(b).click();
		
	}
	public static void typeOnElement(WebDriver driver, By b, String s) {
		driver.findElement(b).clear();
		driver.findElement(b).sendKeys(s);
		
	}
	public static void hoverOver(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(null);
		a.moveToElement(null, 20, 100);
		
		
	}
}
