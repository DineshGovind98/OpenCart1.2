package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabletPage extends BasePage {

	public TabletPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addTo;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement btn_cart;

	@FindBy(xpath = "//td[@class='text-left']//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	WebElement msg_Prd;

	public void clk_add_btn_cart() {
		addTo.click();
	}

	public void cart_basket() {
		btn_cart.click();
	}

	public String getCnfMsg() {
		try {
			return (msg_Prd.getText());

		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
