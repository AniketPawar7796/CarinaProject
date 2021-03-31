package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class FarmLoginPageBase extends AbstractPage {

	  public FarmLoginPageBase(WebDriver driver) {
	        super(driver);
	    }
	  
	 // public abstract LoginPageBase clickNextBtn();
	  
	  public abstract void TypeUsername(String UserName);

	public abstract void TypePassword(String Password);

	public abstract void ClickOnLogin();

	
	 
}
