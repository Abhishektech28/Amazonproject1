package pomwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {

  public WebDriver driver;
	
	// Constructor 
    public Loginpage1(WebDriver driver)
	{
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
	}
	
	// locators
	
	@FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]")
	WebElement txt_click;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_submit;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement btn_signin;
	
	//Action methods
	
	public void click()
	{
		txt_click.click();
	}
	
	public void sendemail()
	{
		txt_email.sendKeys("8087164496");
	}
	
	public void clickSubmit()
	{
		btn_submit.click();
	}
	
	public void sendpass()
	{
		txt_pass.sendKeys("Shete#@12");
	}
	
	public void clickSignInbtn()
	{
		btn_signin.click();
	}
	
}
