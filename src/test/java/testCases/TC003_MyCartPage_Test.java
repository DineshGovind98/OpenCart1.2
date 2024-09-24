package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddtoCartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TabletPage;
import testBase.BaseClass;

public class TC003_MyCartPage_Test extends BaseClass {
	@Test(groups = "cartTest")
	public void myCartTest() {
		try {
			logger.info("Test Started");
			HomePage hp = new HomePage(driver);
			hp.clkMyAct();
			hp.clkLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clkLogin();

			AddtoCartPage ap = new AddtoCartPage(driver);

			ap.clkHeader();

			TabletPage tp = new TabletPage(driver);
			tp.clk_add_btn_cart();
			tp.cart_basket();
			String msg_cart = tp.getCnfMsg();
			Assert.assertEquals(msg_cart, "Samsung Galaxy Tab 10.1");
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
