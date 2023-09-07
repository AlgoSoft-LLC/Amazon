package com.amazon.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;
 

public class AmazonScript extends BaseStartApp
{
	@Test
	public void MouseHoveringOnSignInPage()
	{
		LandingPage land = new LandingPage(driver);
		land.MethodOfHovering();
		
		// new section
		land.ClickOnSignIn();
		
		// today New section 
		SignIn sign = new SignIn(driver);
		sign.fillingIntoBox("jsfilij90jnsfkdh---=-@gmail.com");
		sign.ClickingOnBtn();
	}
	
}
