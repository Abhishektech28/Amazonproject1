package pomwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage {
	
	public WebDriver driver;
	
	public Addresspage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//a[@id='add-new-address-popover-link']")
	WebElement Add_newAddress;
    
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
    WebElement Fname_box;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement Mobnum_box;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement Pincode_box;
	
	@FindBy(xpath="(//input[@id='address-ui-widgets-enterAddressLine1'])[1]")
	WebElement Houseno_box;
	
	@FindBy(xpath="(//input[@id='address-ui-widgets-enterAddressLine2'])[1]")
	WebElement Area_box;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
	WebElement Landmark_box;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-use-as-my-default']")
	WebElement Check_box;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-expand']")
	WebElement Drp_down;
	
	@FindBy(xpath="//button[normalize-space()='Other']")
	WebElement Option_btn;
	
	@FindBy(xpath="//div[@class='a-section ma-property-type-form-block ma-other-form-block ma-form-section-without-spacing']//div[2]//a[1]")
	WebElement Drop_down1;
	
	@FindBy(xpath="//div[@class='a-radio ma-pdl-safe-location-SECURITY_DESK ma-safe-place-options a-spacing-none']//input[@name='preferredDeliveryLocationOTHER']")
	WebElement Dnd_checkbox;
	
	@FindBy(xpath="//div[@class='a-section ma-property-type-form-block ma-other-form-block ma-form-section-without-spacing']//div[2]//a[1]")
	WebElement Drop_down2;
	
	@FindBy(xpath=("(//i[@class='a-icon a-icon-checkbox'])[9]"))
	WebElement Sat_checkbox;
	
	@FindBy(xpath=("(//i[@class='a-icon a-icon-checkbox'])[10]"))
	WebElement Sun_checkbox;
	
	@FindBy(xpath="(//a[@role='button'])[16]")
	WebElement Drop_down3;
	
	@FindBy(xpath=("(//textarea[@placeholder='Provide details such as building description, a nearby landmark, or other navigation instructions.'])[4]"))
	WebElement txtinput_box;
	
	@FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	WebElement Usethis_btn;//input[@class='a-button-input'])[4]
	
	@FindBy(xpath=("(//span[@class='a-button-text'])[5]"))
	WebElement Save_button;		
	
	public void Add_newAddress()
	{
		Add_newAddress.click();
	}
	public void Fnamebox()
	{
		Fname_box.click();
		Fname_box.sendKeys("Abhishek P");
	}
	public void Mobnumbox()
	{
		Mobnum_box.click();
		Mobnum_box.sendKeys("8087164496");
	}
	public void Pincodebox()
	{
		Pincode_box.clear();
		Pincode_box.sendKeys("411027");
	}
	public void Housenobox()
	{
		Houseno_box.sendKeys("Flat no 1203,Vision Starwest,Pune");
	}
	public void Areabox()
	{
		Area_box.sendKeys("Nashik road ,Near Devlali");
	}
	public void Landmark_box()
	{
		Landmark_box.sendKeys("Gajanan Maharaj Mandir");
	}
	public void Checkbox()
	{
		Check_box.click();
	}
	public void Drpdown()
	{
		Drp_down.click();
	}
	public void Optionbtn()
	{
		Option_btn.click();
	}
	public void Dropdown1()
	{
		Drop_down1.click();
	}
	public void Dndcheckbox()
	{
		Dnd_checkbox.click();
	}
	public void Dropdown2()
	{
		Actions a = new Actions(driver);
		a.moveToElement(Drop_down2).perform();
	//	Drop_down2.click(); you will get error if you use this 
	}
	public void Satcheckbox()
	{
		boolean result = Sat_checkbox.isSelected();
		Sat_checkbox.click();
	}
	public void Suncheckbox()
	{
		Sun_checkbox.click();
	}
	public void Dropdown3()
	{
		Drop_down3.click();
	}
	public void txtinputbox()
	{
		txtinput_box.click();
		txtinput_box.sendKeys("Jai hind");
	}
	
	
	public void Usethisbtn()
	{
		Usethis_btn.click();
	}
	public void Savebutton()
	{
		Save_button.click();
	}
	
}
