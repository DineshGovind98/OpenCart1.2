package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginPageTest extends BaseClass {

	@Test(groups = {"Sanity","Regression"})
	public void myAccLogin() {

		logger.info("**** Starting TC002_LoginPageTest ");
		// Homepage
		try {
			HomePage hp = new HomePage(driver);
			hp.clkMyAct();
			hp.clkLogin();
			// Login Page
			logger.info("Login Page Started");
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clkLogin();

			// Myacc Page
			MyAccountPage myaccP = new MyAccountPage(driver);
			boolean status = myaccP.myActConfirmationPage();
			Assert.assertTrue(status);
			logger.info("*****Finished TC002_LoginPageTest ");
		} catch (Exception e) {
			Assert.fail();
		}

	}
}
