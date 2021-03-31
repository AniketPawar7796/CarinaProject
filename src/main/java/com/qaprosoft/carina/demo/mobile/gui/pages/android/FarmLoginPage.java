package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FarmLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = FarmLoginPageBase.class)
public class FarmLoginPage extends FarmLoginPageBase {
	
	 @FindBy(id = "psnumber") 
	 private ExtendedWebElement username;
	 
	 @FindBy(id = "password") 
	 private ExtendedWebElement password;
	 
	 @FindBy(id = "email_sign_in_button") 
	 private ExtendedWebElement login;
	 
	 
	//*[@text='LOGIN

	public FarmLoginPage(WebDriver driver) {
        super(driver);
    }
	
	@Override 
	  public void TypeUsername(String UserName) {
		username.type(UserName);
	}
	
	@Override
	  public void  TypePassword(String Password ) {
		password.type(Password);
    }
	 
	@Override
	  public void ClickOnLogin() {
		login.click();	
	}
	
	
	
	

}
