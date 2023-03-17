package com.eva.vtiger.pages.marketing.leads;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.reusablecode.ReusableCommanCodevtigerDependent;

public class LeadsLandingPage extends ReusableCommanCodevtigerDependent{
	@FindBy(xpath = "//img[@title='Create Lead...']//parent::a")
	private WebElement clickCreateBT;
	
	private  WebDriverUtil WebUtil;
	
	public  LeadsLandingPage(WebDriverUtil WebUtil){
	super(WebUtil);
		this.WebUtil= WebUtil;
	PageFactory.initElements(WebUtil.getDriver(), this);

	}

	public void clickCreateAccountButton(String elementName) {
		WebUtil.usingWebElementclickMethod(clickCreateBT, elementName);
	
	}

}
