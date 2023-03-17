package org.jumia.vtiger.testScripts;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.eva.vtiger.pages.login.LoginPage;
import com.eva.vtiger.pages.myhomepage.home.HomePage;
import com.eva.vtiger.pages.salesPage.leads.NewCustomViewPage;
import com.eva.vtiger.pages.salesPage.leads.Sales_LeadsLandingPage;

public class NewTestScript {

	public void verifyNewCustomView() {
		WebDriverUtil webUtil = new WebDriverUtil();
		webUtil.extentReport();
		webUtil.testCaseId("verifyCreateAccount");
		webUtil.launchBrower("chrome");
		webUtil.hitUrl( "http://localhost:8888/");
		LoginPage loginPageObj = new LoginPage(webUtil);
		 loginPageObj.validLogin();
		HomePage hmp=new HomePage(webUtil);
	    hmp.goTosalesLandingPage();
		 Sales_LeadsLandingPage clickNewLink   =	new  Sales_LeadsLandingPage(webUtil);
	    clickNewLink.clickNewCustomView();
		NewCustomViewPage ncvp =new  NewCustomViewPage(webUtil);
		ncvp.saveNewCustomView();

		webUtil.flushed();
	}
}
