package com.eva.vtiger.pages.salesPage.leads;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.reusablecode.ReusableCommanCodevtigerDependent;

public class Sales_LeadsLandingPage extends ReusableCommanCodevtigerDependent {
	
	@FindBy(xpath = "//a[text()='New']")
	private WebElement newLinkClick;

	private WebDriverUtil webUtil;
	public Sales_LeadsLandingPage(WebDriverUtil webUtil) {
		super(webUtil);
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	}

	public void clickNewCustomView() {
		webUtil.usingWebElementclickMethod(newLinkClick, "Click New Link");
	}

}