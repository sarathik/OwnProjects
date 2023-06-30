package ActionClassLogic;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultWebElementDemo {
	
	ChromeDriver driver;
	
	@Before
	public void initBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(5000);		
	}
	
	@Test
	public void multiEle() {
		List<WebElement> ele =  driver.findElements(By.tagName("a"));
		System.out.println("Total links : "+ ele.size());
		
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());
			
		}
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}

}
