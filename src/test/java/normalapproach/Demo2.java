package normalapproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
					
			driver.get("https://www.opencart.com/");
			
			driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
			//driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
