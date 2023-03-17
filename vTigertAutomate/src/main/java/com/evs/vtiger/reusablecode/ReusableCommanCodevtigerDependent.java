package com.evs.vtiger.reusablecode;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.eva.vtiger.pages.login.LoginPage;
import com.eva.vtiger.pages.myhomepage.home.HomePage;

public class ReusableCommanCodevtigerDependent {

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement SearchforElement;
	
	@FindBy(xpath = "//b[text()='In']//parent::td//following-sibling::td//select[@id='bas_searchfield']")
	private WebElement elementSelectedDD;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchNowElement;
	
	@FindBy(xpath = "//input[@name='submit']//parent::td//following-sibling::td[text()='[x]']")
	private WebElement closePointerBT;
	
	@FindBy(xpath = "//a[text()='Go to Advanced Search']")
	private WebElement advanceSearchBT;
	
	@FindBy(xpath = "//b[contains(text(),'Match Any of the Following')]")
	private WebElement clickMatchAllOfTheFollowing;
	
	@FindBy(xpath = "//b[contains(text(),'Match Any of the Following')]")
	private WebElement clickAnyOfTheFollowing;

//	@FindBy(xpath = "//td[text()='"+ alpha +"']")
//	private WebElement alphaElementclick;
	
	private WebDriverUtil webUtil;
		public ReusableCommanCodevtigerDependent(WebDriverUtil webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
		}
	
	public void Searchfor(String inputValue, String elementName) {
		webUtil.usingWebElementSendKeys(SearchforElement, inputValue, elementName);

	}

	public void inSelectedDropdownMethod(String elementName, String dropdownElememntName) {
		webUtil.SelectByVisibleText(elementSelectedDD,elementName, dropdownElememntName);
	}

	public void searchNow() {
		webUtil.usingWebElementclickMethod(searchNowElement, "Search Now");
	}

	public void closePointer() {
		webUtil.usingWebElementclickMethod(closePointerBT, "Close Pointer");
	}

	public void gotToAdvanceSearch(WebDriverUtil webUtil) {
		webUtil.usingWebElementclickMethod(advanceSearchBT, "Go to Advanced Search");
	}

	public void matchAllOfTheFollowing(WebDriverUtil webUtil) {
		webUtil.usingWebElementclickMethod(clickMatchAllOfTheFollowing,"Match All of the Following");
	}

	public void matchAnyOfTheFollowing(WebDriverUtil webUtil) {
		webUtil.usingWebElementclickMethod(clickAnyOfTheFollowing," Match Any of the Following");
	}


//	public void alphaBatic(char alpha,String elementname) {
 //		if (alpha >= 65 && alpha <= 90) {
//			webUtil.usingWebElementclickMethod(alphaElementclick, elementname);
//		}
//	}

}
