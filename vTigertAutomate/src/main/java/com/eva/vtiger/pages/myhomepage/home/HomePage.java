package com.eva.vtiger.pages.myhomepage.home;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.pages.marketing.leads.LeadsLandingPage;
import com.eva.vtiger.pages.salesPage.leads.Sales_LeadsLandingPage;

public class HomePage {

	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement marketingMo;

	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Leads']")
	private WebElement leadsBT;

	@FindBy(linkText = "Sales")
	private WebElement salesMo;

	@FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Invoice']")
	private WebElement invoiceBT;

	@FindBy(xpath = "//a[text()='Support']")
	private WebElement supportMo;

	@FindBy(xpath = "//div[@id='Support_sub']//a[text()='Contacts']")
	private WebElement contactsBt;
	
	private WebDriverUtil webUtil;
	public HomePage(WebDriverUtil webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	}

	public void goToMarketingLandingPage() {
		webUtil.actionsMouseOver(marketingMo, "Marketing Module");
		webUtil.usingWebElementclickMethod(leadsBT, "Leads");
	}

	public void goTosalesLandingPage() {
		webUtil.actionsMouseOver(salesMo, "Sales Link");
		webUtil.usingWebElementclickMethod(invoiceBT, "invoice");
		
	}

	public void goToSupportLandingPage() {
		webUtil.actionsMouseOver(supportMo, "Support Link");
		webUtil.usingWebElementclickMethod(contactsBt, "Click Contacts");
		
	}
}
