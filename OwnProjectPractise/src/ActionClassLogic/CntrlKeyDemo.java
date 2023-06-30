package ActionClassLogic;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CntrlKeyDemo {
	
	ChromeDriver driver;
	
	@Before
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
			
	}
	
	@Test
	public void openURLNewWindow() {
		WebElement forgetLink = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(forgetLink).keyUp(Keys.CONTROL).build().perform();
		
		System.out.println(driver.getCurrentUrl());
		String initPage = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		int totalTabs = windows.size();
		System.out.println("Total no.of Tabs: " + totalTabs);
		
		for (String s : windows) {
			driver.switchTo().window(s);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(initPage);	
		
	}
	
	@After
	public void postAction() {
		System.out.println("Click Performed");
	}

}
