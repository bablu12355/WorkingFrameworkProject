package org.jumia.vtiger.testScripts;

import org.jumia.vtiger.genericCode.WebDriverUtil;
import org.openqa.selenium.support.PageFactory;

public class Runner {
	public static void main(String[] args) {

//		LeadsTestScript lts=	new	LeadsTestScript();
//		lts.verifyCreateLeads();
		
//		NewTestScript nts = new NewTestScript();
//		nts.verifyNewCustomView();

		TableTestScript tts = new TableTestScript();
		tts.verifyFirstName();
	
	}
}
