package testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomwithPageFactory.Addresspage;
import pomwithPageFactory.Homepage;
import pomwithPageFactory.Loginpage1;
import pomwithPageFactory.PlaceOrderpage;

public class LoginTest {
	
	WebDriver driver;// ithe declare kele tr @BeforeClass made driver = new ChromeDriver(); asech lihave
	
	Loginpage1 lp;
	Homepage hp;
	Addresspage ad;
	PlaceOrderpage po;
	
	@BeforeClass
	void setup() 
	{
	    driver = new ChromeDriver();// if you use WebDriver driver = new ChromeDriver(); You will get error 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void test1()
	{
		lp = new Loginpage1(driver);
		hp = new Homepage(driver);
		ad = new Addresspage(driver);
		po = new PlaceOrderpage(driver);
	}
	
	@Test(priority=2)//dependsOnMethods = {"test1"}
	void test2()
	{
	   lp.click();	
	   lp.sendemail();
	   lp.clickSubmit();
	   lp.sendpass();
	   lp.clickSignInbtn();
	   
	}
	@Test(priority=3,dependsOnMethods = {"test2"})
	void test3() throws InterruptedException  
	{
		hp.inputbox();
		hp.searchbtn();
		hp.txtclick();
	for (String windowHandle : driver.getWindowHandles()) 
		driver.switchTo().window(windowHandle);
	Thread.sleep(2000);
        hp.colourbox();
        hp.sizebox();
	}
	@Test(priority=4,dependsOnMethods ={"test3"})
	void test4() throws InterruptedException 
	{	    
        Thread.sleep(2000);    
	    hp.qtydropdown();
	    hp.btnaddtocart();	 
	     
	    Thread.sleep(2000);
	    hp.btngotocart();
	    hp.input1box();
	    hp.btnprotobuy();
	}
	@Test(priority=5,dependsOnMethods = {"test4"})
	void test5() throws InterruptedException
	{
      ad.Add_newAddress();
		ad.Fnamebox();
		ad.Mobnumbox();
		ad.Pincodebox();
		ad.Housenobox();
		ad.Areabox();
		ad.Landmark_box();
		ad.Checkbox();
		ad.Checkbox();
		ad.Drpdown();
		ad.Optionbtn();
		ad.Dropdown1();
		ad.Dndcheckbox();
		ad.Dropdown2();
		Thread.sleep(2000);
		ad.Satcheckbox();
		ad.Suncheckbox();
		ad.Dropdown3();
     	ad.txtinputbox();
		
		ad.Usethisbtn();
		ad.Savebutton();
		
	}
	@Test(priority=6,dependsOnMethods = {"test5"})
	void test6() throws InterruptedException
	{
		po.Usethisaddres();
		Thread.sleep(5000);
		po.Savegiftcontinue();
		Thread.sleep(4000);
		driver.navigate().refresh();
		po.Usethispaymentbtn();
		
	}	
/*	@AfterClass
	void tearDown()
	{
		driver.quit();
	}*/
	
	
}

