package com.eva.vtiger.pages.marketing.leads;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsInfomationLandingPage {

	@FindBy(xpath = "//td[@class='dvtSelectedCell']")
	private WebElement LeadInformationtxt;

	@FindBy(xpath = "//span[@id='dtlview_Company']")
	private WebElement ExpertViewAutomation;

	private WebDriverUtil webUtil;
	
	public LeadsInfomationLandingPage(WebDriverUtil webUtil) {
		this.webUtil= webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}
	public void validateLeadsDetailInfo() {
		webUtil.validateText(LeadInformationtxt, "Lead Information", "Lead Information");
	}

	public void ValidateLeadNoLeadsDetailInfo() {
		webUtil.validateText(ExpertViewAutomation, "Expert View Automation", "Expert View Automation");
	}
}
