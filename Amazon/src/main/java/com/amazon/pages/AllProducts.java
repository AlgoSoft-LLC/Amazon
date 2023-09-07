package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts {

	Actions action;
	
	@FindBy(linkText = "Laptops & Accessories")
	private WebElement ClickOnLoptopAndAccessories;
	
	@FindBy(linkText = "Apple")
	private WebElement ClickOnApple;
	
	public AllProducts(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
		action = new Actions(driver);
	}
	
	public void HoverOnLoptopAndAccessories()
	{
		action.moveToElement(ClickOnLoptopAndAccessories).build().perform();
	}
	
	public void ClickOnAppleLink()
	{
		ClickOnApple.click();
	}
	
}
