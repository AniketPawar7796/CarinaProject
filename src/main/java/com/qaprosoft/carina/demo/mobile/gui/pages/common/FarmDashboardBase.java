package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class FarmDashboardBase extends AbstractPage {

	public FarmDashboardBase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public abstract void clickOnNew();

	public abstract void manufacturer(String select);
}
