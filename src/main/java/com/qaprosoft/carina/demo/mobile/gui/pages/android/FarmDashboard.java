package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ContactUsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FarmDashboardBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FarmLoginPageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = FarmDashboardBase.class)
public class FarmDashboard extends FarmDashboardBase {
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ltfs.lti.ltfs:id/bb_bottom_bar_icon'])[4]")
	private ExtendedWebElement New;
	 
	@FindBy(xpath = "//android.widget.TextView[@text='Select Manufacturer']")
	private ExtendedWebElement SelectManufacturer;
	
	

	public FarmDashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickOnNew() {
		New.clickIfPresent(60);
		//New.click();
	}
	
	@Override
	public void manufacturer(String select) {
		SelectManufacturer.click();
		SelectManufacturer.select(select);
	}
	
}
