package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargerOfApple {
	
	@FindBy(xpath = "(//div[contains(@class,'a-section a-spacing-base')])[1]")
	private WebElement ClickOnCard;
	
	public ChargerOfApple(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	public void clickOnFirstCard()
	{
		ClickOnCard.click();
	}

}
