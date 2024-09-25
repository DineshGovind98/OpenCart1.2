package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddtoCartPage extends BasePage {

	public AddtoCartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()='Tablets']")
	WebElement prd_Tablets;

	@FindBy(xpath = "//a[normalize-space()='Components']")
	WebElement components;

	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	WebElement macProduct;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")WebElement phones;
	
	public void clkHeader() {
		prd_Tablets.click();
	}

	public void actionMethod() {
		Actions act = new Actions(driver);
		act.moveToElement(components).moveToElement(macProduct).click().perform();

	}

	public void clkPhones() {
		phones.click();
	}
}
