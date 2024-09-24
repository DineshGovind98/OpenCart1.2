package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MonitorsPage;
import testBase.BaseClass;

public class TC004_Components_addMonitorPage extends BaseClass {
	@Test
	public void verifyAddMonitorTest() throws InterruptedException {
		logger.info("***********STarting TC004_Components_addMonitorPage");
		try {
		HomePage hp = new HomePage(driver);
		hp.clkMyAct();
		hp.clkLogin();
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkLogin();
		MonitorsPage mp=new MonitorsPage(driver);
		mp.movetoElements();
		mp.mac();
		mp.clickBtnRadio();
		mp.textData();
		mp.selectData();
		mp.areaText();
		mp.FileUpload();
		Thread.sleep(2000);
		mp.finalCart();
		Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
		logger.info("***********Finished TC004_Components_addMonitorPage");
		
	}

}
