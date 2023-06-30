package ActionClassLogic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabKeyDemo {
	
	ChromeDriver driver;
	
	@Before
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void loginSet() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
	}

	@After
	public void confirm() {
		System.out.println("Tab performed");
	}
}
