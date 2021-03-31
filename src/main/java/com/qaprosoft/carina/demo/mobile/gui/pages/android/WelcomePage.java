package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(id = "carina_logo")
    private ExtendedWebElement title;

    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;
    
    @FindBy(xpath = "//android.widget.Image[@text='LennoxPros Logo']")
	public ExtendedWebElement logo_Lennox;

	@FindBy(xpath = "//android.view.View[@content-desc='Please sign in or create an account']")
	public ExtendedWebElement link_Login;

	@FindBy(xpath = "//android.view.View[@text='User ID (Email)']")
	public ExtendedWebElement txt_UserName;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='j_username']")
	public ExtendedWebElement editbox_UserName;

	@FindBy(xpath = "//android.widget.EditText[@resource-id='j_password']")
	public ExtendedWebElement editbox_Password;

	@FindBy(xpath = "//android.widget.Button[@resource-id='loginSubmit']")
	public ExtendedWebElement btn_SignIn;

	@FindBy(xpath = "//android.view.View[@text='Repair Part Finder']")
	public ExtendedWebElement repair_Finder;
	
	@FindBy(id = "j_username")
	private ExtendedWebElement nameInputField;

	@FindBy(id = "j_password")
	private ExtendedWebElement passwordInputField;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    @Override
    public LoginPageBase clickNextBtn() {
        //nextBtn.click();
        link_Login.click();
        return initPage(getDriver(), LoginPageBase.class);
    }

}
