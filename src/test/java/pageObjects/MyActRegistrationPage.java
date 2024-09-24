package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyActRegistrationPage extends BasePage {

	public MyActRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPwd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkConfirmBox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}

	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void setCnfPassword(String cnfPass) {
		txtConfirmPwd.sendKeys(cnfPass);
	}

	public void checkBox() {
		chkConfirmBox.click();
	}

	public void continueBtn() {
		btnContinue.click();
	}

	public String getConfirmationPage() {
		try {
			return (msgConfirmation.getText());

		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}