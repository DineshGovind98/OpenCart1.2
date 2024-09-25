package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePage extends BasePage {

	public MobilePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='caption']//a[contains(text(),'iPhone')]")WebElement iphone;
	
	@FindBy(xpath="//input[@id='input-quantity']")WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-cart']")WebElement addiphone;
	
	@FindBy(xpath="//span[@id='cart-total']")WebElement total;
	
	@FindBy(xpath="//strong[normalize-space()='Checkout']")WebElement checkout;
	
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")WebElement confrimationMsg;
	
	public void iphoneAdd() {
		iphone.click();
	}

	public void quantityAdd() {
		quantity.sendKeys("4");
	}
	public void addIphoneToCart() {
		addiphone.click();
	}
	
	public void totalCart() {
		total.click();
	}
	public void CheckoutCart() {
		checkout.click();
	}
	
	public String msgOfConfirmation() {
		return confrimationMsg.getText();
	}
}
