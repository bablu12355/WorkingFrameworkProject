package com.eva.vtiger.pages.myhomepage.home;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationHomePage {

	@FindBy(xpath = "//a[text()='Linda']")
	private WebElement lindaClick;

	private WebDriverUtil webUtil;

	public ValidationHomePage(WebDriverUtil webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	}
	public void validateFirstName() {
		webUtil.validateText(lindaClick, "Linda", "Linda");

	}
}
