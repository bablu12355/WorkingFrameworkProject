package org.jumia.vtiger.testScripts;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.eva.vtiger.pages.login.LoginPage;
import com.eva.vtiger.pages.myhomepage.home.HomePage;
import com.eva.vtiger.pages.myhomepage.home.ValidationHomePage;
import com.evs.vtiger.reusablecode.ReusableCommanCodevtigerDependent;

public class TableTestScript {

	public void verifyFirstName() {
		WebDriverUtil webUtil=new WebDriverUtil ();
		webUtil.extentReport();
		webUtil.testCaseId("verifyCreateAccount");
		webUtil.launchBrower("chrome");
		webUtil.hitUrl( "http://localhost:8888/");
		LoginPage loginPageObj =new LoginPage(webUtil);
	    loginPageObj.validLogin();
	    HomePage hmp=	new HomePage(webUtil);
	    hmp.goToSupportLandingPage();
		ReusableCommanCodevtigerDependent rccd=new ReusableCommanCodevtigerDependent(webUtil);
		rccd.Searchfor("Linda", "Linda");
		rccd.inSelectedDropdownMethod("First Name", "First Name");
		rccd.searchNow();
		ValidationHomePage validateHmp=	new ValidationHomePage(webUtil);
		validateHmp.validateFirstName();
		webUtil.flushed();

	}
}
