package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyActRegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegTest extends BaseClass {
	

	
	
	@Test(groups = {"Regression","Master"})
	public void verify_account_reg() {
		try {
		logger.info("Starting TC001_AccountRegTest");
		HomePage hp=new HomePage(driver);
		hp.clkMyAct();
		logger.info("Clciked My Account link");
		hp.clkRegister();
		logger.info("Clicked on Register link");
		String rd=randomAlphaNumeric();
		
		MyActRegistrationPage mp=new MyActRegistrationPage(driver);
		mp.setFirstName(randomString().toUpperCase());
		mp.setLastName(randomString().toUpperCase());
		mp.setEmail(randomString()+"@gmail.com");
		mp.setPhone(randomNmber());
		mp.setPassword(rd);
		mp.setCnfPassword(rd);
		mp.checkBox();
		mp.continueBtn();
		String cnfMsg=mp.getConfirmationPage();
		if(cnfMsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(cnfMsg, "Your Account Has Been Created!");
		}catch(Exception e) {
			
			Assert.fail();
		}

	}

}
