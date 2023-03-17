package com.eva.vtiger.pages.login;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.pages.myhomepage.home.HomePage;

public class LoginPage {

	@FindBy(name = "user_name")
	private WebElement userNameEd;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement userPasswordEd;;

	@FindBy(xpath = "//input[@name='Login']")
	private WebElement loginBt;;

	@FindBy(xpath = "//select[@name='login_theme']")
	private WebElement login_theme_Dd;

	@FindBy(xpath = "//input[@name='login_language']")
	private WebElement login_language_Dd;

	private WebDriverUtil WebUtil;
	public LoginPage(WebDriverUtil WebUtil){
		this.WebUtil=WebUtil;
		PageFactory.initElements(WebUtil.getDriver(), this);
	}
	public void  validLogin() {
		WebUtil.usingWebElementSendKeys(userNameEd, "admin", "username");
		WebUtil.usingWebElementSendKeys(userPasswordEd, "Bablu@123", "userpassword");
		WebUtil.usingWebElementclickMethod(loginBt, "Login Button");
	}

	public void invalidLogin() {
		WebUtil.usingWebElementSendKeys(userNameEd, "admin", "username");
		WebUtil.usingWebElementSendKeys(userPasswordEd, "Bablu@12345", "userpassword");
		WebUtil.usingWebElementclickMethod(loginBt, "Login Button");
	
	}

	public void changeColor(String login_theme) {
		WebUtil.selectByValueAttribute(login_theme_Dd, "Color Theme", login_theme);
	}

	public void changeLanguage(String login_language) {
		WebUtil.selectByValueAttribute(login_language_Dd, "language", login_language);
	}

}
