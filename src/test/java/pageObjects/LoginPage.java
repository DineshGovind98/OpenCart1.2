package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_email;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_passKey;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;

	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}

	public void setPassword(String pass) {
		txt_passKey.sendKeys(pass);
	}

	public void clkLogin() {
		btnLogin.click();
	}

}
