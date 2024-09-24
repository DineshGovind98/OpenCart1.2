package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC002_LoginTestDDT extends BaseClass {
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups = "DataDriven")
	public void verifyTestDDT(String email, String pwd, String exp) {
		logger.info("Started TC002_LoginTestDDT");
		try {
		HomePage hp = new HomePage(driver);
		hp.clkMyAct();
		hp.clkLogin();
		// Login Page
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clkLogin();
		MyAccountPage myaccP = new MyAccountPage(driver);
		boolean status = myaccP.myActConfirmationPage();

		if (exp.equalsIgnoreCase("Valid")) {
			if (status == true) {
				myaccP.clkLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		if (exp.equalsIgnoreCase("Invalid")) {
			if (status == true) {
				myaccP.clkLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("Ended TC002_LoginTestDDT");
	}
}
