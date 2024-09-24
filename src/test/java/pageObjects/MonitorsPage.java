package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MonitorsPage extends BasePage{

	public MonitorsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Components']")WebElement from;
	
	@FindBy(xpath="//a[normalize-space()='Monitors (2)']")WebElement to;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")WebElement addMac;
	
	@FindBy(xpath="//div[@id='input-option218']//label[1]")WebElement btnRadio;
	
	@FindBy(xpath="//input[@value='10']")WebElement chkBox;
	
	@FindBy(xpath="//input[@id='input-option208']")WebElement textField;
	
	@FindBy(xpath="//select[@id='input-option217']")WebElement selectField;
	
	@FindBy(xpath="//textarea[@id='input-option209']")WebElement textArea;
	
	//"C:\Users\Faster\Downloads\DockerSetup.pdf"
	
	@FindBy(xpath = "//button[@id='button-upload222']")WebElement btn_upload;
	
	@FindBy(xpath="//button[@id='button-cart']")WebElement addTo;
	
	public void movetoElements() {
		Actions ac=new Actions(driver);
		ac.moveToElement(from).moveToElement(to).click().perform();
	}
	
	public void mac() {
		addMac.click();
	}
	public void clickBtnRadio() {
		btnRadio.click();
	}
	public void textData() {
		textField.sendKeys("Test");
	}
	public void selectData() {
	Select st=new Select(selectField);
	st.selectByIndex(2);
	
	}
	public void areaText() {
		textArea.sendKeys("Test1");
	}
	public void FileUpload() {
		String file="C:\\Users\\Faster\\Downloads\\DockerSetup.pdf";
		btn_upload.sendKeys(file);
		//driver.switchTo().alert().accept();
	}
	public void finalCart() {
		addTo.click();
	}
	

}
