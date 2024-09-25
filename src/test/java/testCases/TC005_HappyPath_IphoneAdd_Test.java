package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddtoCartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MobilePage;
import testBase.BaseClass;

public class TC005_HappyPath_IphoneAdd_Test extends BaseClass {
	@Test(groups="Regression")
	public void addIphoneToCart() {
		try {
		logger.info("**********StartingTC005_HappyPath_IphoneAdd_Test")	;
		HomePage hp=new HomePage(driver);
		hp.clkMyAct();
		hp.clkLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkLogin();
		AddtoCartPage ap=new AddtoCartPage(driver);
		ap.clkPhones();
		MobilePage mp=new MobilePage(driver);
		mp.iphoneAdd();
		mp.quantityAdd();
		mp.addIphoneToCart();
		mp.totalCart();
		mp.CheckoutCart();
		String msg=mp.msgOfConfirmation();
		Assert.assertTrue(true);
		logger.info("**********Finished TC005_HappyPath_IphoneAdd_Test")	;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
