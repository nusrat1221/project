package TargetLoop;

import org.openqa.selenium.By;

public class TargetObjectRep {

	public static String url = "https://www.target.com/";
	public static By deals = By.id("secondary");
	public static By dealsClearance = By.id("deals-clearance"); 
	public static By shoesClearance = By.xpath("//a[@data-lnk='ShoesClearance']"); 
	public static By firstShoe = By.xpath("/html/body/div[1]/div/div[5]/div[3]/div[2]/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[1]/div[1]/a");
	public static By oneShoePrice = By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/div[1]/div[1]/div[1]");
	public static String oneshoe = "$25.99";
	public static By clickquantityIncrease = By.xpath("//button[@data-test='custom-quantity-picker']");
	public static By increaseToTwoShoes= By.xpath("//ul[@id='options']/li[2]");
	public static By ShipIt = By.xpath("//button[@data-test='shipItButton']");
	public static By viewCart = By.xpath("//button[@data-test='addToCartModalViewCartCheckout']"); 
	public static By twoShoeSubtotal = By.xpath("//p[@class='h-text-bs']");
	public static String twoshoe = "$51.98"; 
	public static By changeQuantity = By.id("default-id-change-me");
	public static int backToOneShoe = 1;
	public static String shoeValue = "Qty 1";
	public static By lastSubtotal= By.className("Row__StyledRow-sc-19ydihw-0 bUoBNS");
	public static double lastTotal= 25.99;
	
	
}
