package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;

public class myFrameWork {

	WebDriver driver = new ChromeDriver();
	
	public myFrameWork(WebDriver driver,String url) {
		
		
		driver = this.driver;
		driver.get(url);
		
	}
	
	
	public void Login(){
		
		WebElement element = driver.findElement(By.linkText("Sign in"));
		element.click();
		
		element = driver.findElement(By.id("email"));
		element.sendKeys("my.automation@mailinator.com");
		
		element = driver.findElement(By.id("passwd"));
		element.sendKeys("pop090");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		
		
	}
	
	public void searchItem(String item)
	{
		driver.findElement(By.name("search_query")).sendKeys(item);
		driver.findElement(By.name("submit_search")).click();
		
		
		
		
	}
	
	public void AddToCart()
	{
		//WebElement element = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		WebElement element = driver.findElement(By.cssSelector("link[href='http://schema.org/InStock']"));
		
		System.out.printf("Found Element {}",element.toString());
		
		Actions action = new Actions (driver);
		action.moveToElement(element);
		
		// driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")).click();*/
		
			
		
		
		
		
	}
	
}
