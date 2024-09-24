package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myAct;
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement myActRegister;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement myActLogin;

	public void clkMyAct() {
		myAct.click();
	}

	public void clkRegister() {
		myActRegister.click();
	}
	public void clkLogin() {
		myActLogin.click();
	}
}
