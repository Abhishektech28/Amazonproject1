package pomwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderpage {
	
public WebDriver driver;
	
	public PlaceOrderpage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=("//input[@data-testid='Address_selectShipToThisAddress']"))
	WebElement Usethis_addres;
	
	@FindBy(xpath=("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']"))
	WebElement Savegift_continue;
	
	@FindBy(xpath=("(//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce'])[1]"))
	WebElement Usethis_paymentbtn;
	
	public void Usethisaddres()
	{
		Usethis_addres.click();
	}
	public void Savegiftcontinue()
	{
		Savegift_continue.click();
	}
	public void Usethispaymentbtn()
	{
		Usethis_paymentbtn.click();
	}
}
