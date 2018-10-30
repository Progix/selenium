package automationpractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAutomationPractice {

	private static final Logger log = LoggerFactory.getLogger(TestAutomationPractice.class);
	
	private WebDriver driver = null;
	
	@Test
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/p/Softwares/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		
		driver.get("http://automationpractice.com/index.php");
		
		log.info("Opened the URL");
		
		WebElement element = findElementBy(By.partialLinkText("Sign in"));
		element.click();
		element = findElementBy(By.id("email"));
		element.sendKeys("my.automation@mailinator.com");
		element = findElementBy(By.id("passwd"));
		element.sendKeys("pop090");
		element = findElementBy(By.id("SubmitLogin"));
		element.click();
		element = findElementBy(By.partialLinkText("Sign out"));
		element.click();
		
		log.info("Terminating");
		
		Thread.sleep(10000);
		
		driver.close();
	}
	
	private WebElement findElementBy(By by) {
		WebElement element = driver.findElement(by);
		if (element.isDisplayed() ) {
			log.info("Element is visible now. {}", element.toString());
			return element;
		}
		return null;
	}
	
}
