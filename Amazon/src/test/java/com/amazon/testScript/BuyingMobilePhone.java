package com.amazon.testScript;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.amazon.pages.AllProducts;
import com.amazon.pages.BuyNow;
import com.amazon.pages.ChargerOfApple;
import com.amazon.pages.LandingPage;

public class BuyingMobilePhone extends BaseStartApp
{
	
	@Test
	public void BuyMobileFromAmazon()
	{
		LandingPage mobile = new LandingPage(driver);
		mobile.ClickOnMobile();
		
		AllProducts hover = new AllProducts(driver);
		hover.HoverOnLoptopAndAccessories();
		
		hover.ClickOnAppleLink();
		
		ChargerOfApple charger = new ChargerOfApple(driver);
		charger.clickOnFirstCard();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		BuyNow buy = new BuyNow(driver);
		buy.clickOnBuyNowBtn();
		
		

		
	}
}
