package Weatherloop;

import org.openqa.selenium.By;

public class WeatherObjRep {
public static String weatherURL = "https://weather.com/";
public static By searchBox = By.id("LocationSearch_input");
public static By selectBronx = By.xpath("//button[text()='The Bronx, NY']");
public static String zipCode = "10462";
public static By temperature = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div[1]/div/div/div/a[1]/span");
public static By searchIcon= By.cssSelector("svg[name='location']");







}
