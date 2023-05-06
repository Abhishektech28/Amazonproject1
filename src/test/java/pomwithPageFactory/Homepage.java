package pomwithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Homepage {
	
	 public WebDriver driver;
	 
	public Homepage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	// locators
	 @FindBy(xpath = "//input[@name='field-keywords']")
	 WebElement input_box;
	 
	 @FindBy(xpath = "(//input[@type='submit'])[1]")
	 WebElement search_btn;
	 
	 @FindBy(xpath = "(//span[@class='a-price-whole'][normalize-space()='469'])[1]")//(//span[@class='a-price-whole'][normalize-space()='469'])[1]
	 WebElement txt_click;
	 
	 @FindBy(xpath="(//input[@name='1'])[1]")//li[@data-asin='B0BZLDWKLT']
     WebElement colour_box;
	 
	 @FindBy(xpath="//li[@data-asin='B0BV6W7WWW']")
	 WebElement size_box;
	 
	 @FindBy(id="quantity")
	 WebElement qty_dropdown;
	 
	 @FindBy(xpath="//input[@id='add-to-cart-button']")
	 WebElement btn_addtocart;
	 
	 @FindBy(xpath="//a[@href='/cart?ref_=sw_gtc']")
	 WebElement btn_gotocart;
	 
	 @FindBy(xpath="//input[@id='sc-buy-box-gift-checkbox']")
	 WebElement input1_box;
	 
	 @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
     WebElement btn_protobuy;	 
	 
	//Action methods
	 
	 public void inputbox()
	 {
		 input_box.click();
		 input_box.sendKeys("ANNI DESIGNER Women's Cotton Blend Printed Straight Kurta with Pant (Pustak Blue)");
	 }
	 public void searchbtn()
	 {
		 search_btn.click();
	 }
	 public void txtclick() 
	 {
		 txt_click.click();
	 }
	 public void colourbox() 
	 {
		 colour_box.click();
	 }
	 public void sizebox() 
	 {
		 size_box.click();
	 }
	 public void qtydropdown() 
	 {
		 Select s = new Select(qty_dropdown);
		 s.selectByIndex(3); 
	 }
	 public void btnaddtocart() 
	 {
		 btn_addtocart.click();
	 }
	 public void btngotocart() 
	 {
		 btn_gotocart.click();
	 }
	 public void input1box() 
	 {
		 input1_box.click();
	 }
	 public void btnprotobuy() 
	 {
		 btn_protobuy.click();
	 }
	 
	 
	
	
	
}
