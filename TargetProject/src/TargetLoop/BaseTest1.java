package TargetLoop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest1 {
	
	WebDriver dr= null;
	
	public WebDriver openbrowser(String s) {
	if(dr==null) {
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		dr = new FirefoxDriver();
		dr.get(s);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	return dr;
	}
	public void closeBroswer() {
		dr.quit();
	}
	
}
