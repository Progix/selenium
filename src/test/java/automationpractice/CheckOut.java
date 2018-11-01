package automationpractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckOut {

	WebDriver driver = null;
	
	@Test 
	public void SelectItemCheckOut() throws InterruptedException
	{ 
		
		System.setProperty("webdriver.chrome.driver","//Users//devkey//Softwares//chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		
		myFrameWork frameWork = new myFrameWork(driver,"http://automationpractice.com/index.php");
		
		frameWork.Login();
		frameWork.searchItem("t-shirt");
		Thread.sleep(10000);
		
		frameWork.AddToCart();
		//System.out.println("Added to Cart");s
		
		
		
		
		
	}
	
	
	
}
