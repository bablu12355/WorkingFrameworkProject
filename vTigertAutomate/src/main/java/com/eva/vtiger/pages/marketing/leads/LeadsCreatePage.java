package com.eva.vtiger.pages.marketing.leads;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsCreatePage {
 
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameEd;
  
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameEd;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyEd;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleED;
	
	@FindBy(id="mobile")
	private WebElement mobileED;
	
	@FindBy(id="email")
	private WebElement emailED;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetEd;
	
	@FindBy(id="country")
	private WebElement CountryEd;
	
	@FindBy(id="state")
	private WebElement StateEd;
	
	@FindBy(xpath="//b[contains(text(),'Description Information')]//parent::td//parent::tr//following-sibling::tr//following-sibling::td//following-sibling::div//input[@title='Save [Alt+S]']")
	private WebElement saveLeadsBt;
	
	@FindBy(xpath="//b[contains(text(),'Description Information')]//parent::td//parent::tr//following-sibling::tr//following-sibling::td//following-sibling::div//input[@title='Cancel [Alt+X]']")
	private WebElement cancelLeadsBt;
	
	private  WebDriverUtil webUtil;
	
	public LeadsCreatePage(WebDriverUtil webUtil) {
		this. webUtil= webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	 }
	public void enterValueInformation() {
		webUtil.usingWebElementSendKeys(firstNameEd, "Bablu1234", "First Name");
		webUtil.usingWebElementSendKeys(lastNameEd, "Yaduvanshi", "Last Name");
		webUtil.usingWebElementSendKeys(companyEd, "Expert View Automation", "Company");
		webUtil.usingWebElementSendKeys(titleED,"hii this is bablu yadav task to create leads", "Title");
		webUtil.usingWebElementSendKeys(mobileED, "6368993420", "Mobile");
		webUtil.usingWebElementSendKeys(emailED, "by862473@gmail.com", "Email");
		webUtil.usingWebElementSendKeys(streetEd, "Mahboobpur..Kukrauthi..Bhadohi","Street");
		webUtil.usingWebElementSendKeys(CountryEd, "India", "Country");
		webUtil.usingWebElementSendKeys(StateEd, "Uttar Pradesh", "State");
	}
	

	public void saveLeads() {
		enterValueInformation();
		webUtil.usingWebElementclickMethod(saveLeadsBt, "Click");
	}

	public void cancelLeads() {
		enterValueInformation();
		webUtil.usingWebElementclickMethod(cancelLeadsBt, "Click");
	}

}
