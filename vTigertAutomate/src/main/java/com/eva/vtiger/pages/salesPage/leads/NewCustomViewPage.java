package com.eva.vtiger.pages.salesPage.leads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomViewPage {
@FindBy(name="viewName")
	private WebElement ViewnameEd;

@FindBy(xpath="//input[@name='setDefault']")
private WebElement setDefaultClick;

@FindBy(xpath="//input[@name='setStatus']")
private WebElement setStatusClick;

@FindBy(id="column1")
private WebElement customerNoDd;

@FindBy(id="column2")
private WebElement invoiceDateDd;
	
@FindBy(id="column3")
private WebElement invoiceNoDd;

@FindBy(id="column4")
private WebElement purchasOrderDd;

@FindBy(id="column5")
private WebElement dueDateDd;

@FindBy(id="column6")
private WebElement totalNoDd;

@FindBy(id="column7")
private WebElement exciseDutyDd;

@FindBy(id="column8")
private WebElement invoiceSubjectDd;

@FindBy(id="column9")
private WebElement billingPostalCodeDd;

@FindBy(xpath="//select[@name='stdDateFilterField']")
private WebElement invoiceDueDateDd;

@FindBy(xpath="//option[text()='Tomorrow']//parent::select")
private WebElement TomorrowDd;

@FindBy(xpath="//input[@id='jscal_field_date_start']")
private WebElement startDateEd;

@FindBy(xpath="//input[@id='jscal_field_date_end']")
private WebElement endDateEd;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBt;

@FindBy(xpath="//input[@title='Cancel [Alt+X]")
private WebElement cancelBt;

private WebDriverUtil webUtil;
	public NewCustomViewPage(WebDriverUtil webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	}

	public void enterValueInformation() {
  webUtil.usingWebElementSendKeys(ViewnameEd, "Bablu Yadav", "View Name"); 
  webUtil.usingWebElementclickMethod(setDefaultClick, "set as default");
  webUtil.setImplicitlyWait(5);
  webUtil.usingWebElementclickMethod(setStatusClick, "set as default");
  webUtil.SelectByVisibleText(customerNoDd, "Customer No","Customer No");
  webUtil.SelectByVisibleText(invoiceDateDd, "Invoice Date","Invoice Date ");
  webUtil.SelectByVisibleText(invoiceNoDd, "Invoice No","Invoice No");
  webUtil.SelectByVisibleText(purchasOrderDd, " Purchase Order ","Purchase Order ");
  webUtil.selectByValueAttribute(dueDateDd, "vtiger_invoice:duedate:duedate:Invoice_Due_Date:D","vtiger_invoice:duedate:duedate:Invoice_Due_Date:D");
  webUtil.selectByValueAttribute(totalNoDd, "vtiger_invoice:total:hdnGrandTotal:Invoice_Total:N","vtiger_invoice:total:hdnGrandTotal:Invoice_Total:N");
  webUtil.SelectByVisibleText(exciseDutyDd, "Excise Duty","Excise Duty");
  webUtil.selectByValueAttribute(invoiceSubjectDd, "vtiger_invoice:subject:subject:Invoice_Subject:V","vtiger_invoice:subject:subject:Invoice_Subject:V");
  webUtil.SelectByVisibleText(billingPostalCodeDd, "Billing Postal Code","Billing Postal Code");
  webUtil.SelectByVisibleText(invoiceDueDateDd, "Invoice - Due Date","Invoice - Due Date");
  webUtil.SelectByVisibleText(TomorrowDd, "Tomorrow","Tomorrow");
	webUtil.usingWebElementSendKeys(startDateEd,"20-8-1999", "Start Date");
	webUtil.usingWebElementSendKeys(endDateEd, "20-7-2071","End date");
  
	}

	public void saveNewCustomView() {
		enterValueInformation();
		webUtil.usingWebElementclickMethod(saveBt, "Click Save Button ");
	}

	public void cancelNewCustomView() {
		enterValueInformation();
		webUtil.usingWebElementclickMethod(cancelBt, "Click Save Button ");
	}
}
