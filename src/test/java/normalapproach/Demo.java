package normalapproach;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Launch the url 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Signin 
		driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8087164496");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shete#@12");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		// Signout 
	  //driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
	  //driver.findElement(By.xpath("(//span[@class='nav-text'])[18]")).click();
		
		// Search product 
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("kurta set for women");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		// add product in to the cart 
	driver.findElement(By.xpath("(//span[@class='a-price-whole'][normalize-space()='469'])[1]")).click();
	for (String windowHandle : driver.getWindowHandles()) 
        driver.switchTo().window(windowHandle);
	driver.findElement(By.xpath("//li[@data-asin='B0BZLCXJMM']")).click();
  // driver.findElement(By.xpath("//li[@data-asin='B0BV6WSF33']")).click();
	
	// Go to cart and proceed to Buy
/*	driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
	driver.findElement(By.xpath("//input[@name='isToBeGiftWrapped']")).click();
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();*/
	
	
  
	}

	}
	
