package com.qaprosoft.carina.demo;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.FarmDashboard;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.LoginPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FarmDashboardBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FarmLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.UIElementsPageBase;



public class FarmTest extends AbstractTest {
	
//	public  static FarmLoginPageBase LoginPage =null;
//    public static FarmDashboardBase farmDash=null;

	@Test(dataProvider = "DataProvider")
	 @XlsDataSourceParameters(path = "xls/Farm.xlsx", sheet = "GSMArena", dsUid = "TUID", dsArgs = "UserName,Password,select")
	   public void testLoginUser(String UserName, String Password, String select) {
		
		FarmLoginPageBase LoginPage = initPage(getDriver(), FarmLoginPageBase.class);
	    LoginPage.TypeUsername(UserName);
	    LoginPage.TypePassword(Password);
	    LoginPage.ClickOnLogin();
	  
	    FarmDashboardBase farmDash = initPage(getDriver(), FarmDashboardBase.class);
	    

	    System.out.println("1111111111111111111111111111111");
	    farmDash.clickOnNew();
	    
	    try {
			Thread.sleep(30000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println("22222222222222222222222222222222222" +select);
	  farmDash.manufacturer(select);
	  System.out.println("3333333333333333333333333333333333333333333");
	  
	//Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
	}

	
//	  @Test(dataProvider = "DataProvider", priority = 2)
//	  @XlsDataSourceParameters(path = "xls/Farm.xlsx", sheet = "GSMArena", dsUid ="TUID", dsArgs = "select")
//	  public void test02Dealer(String select) {
//	 System.out.println("______________________" +select);
//		
//		  
//	   farmDash = initPage(LoginPage.getDriver(), FarmDashboardBase.class);
//
//	  
//	  System.out.println("1111111111111111111111111111111");
//	  farmDash.clickOnNew();
//	  System.out.println("22222222222222222222222222222222222");
//	  
//	  }
	
}
