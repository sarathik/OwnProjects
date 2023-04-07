package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Opening the Firefox browser and load 
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/");
		Thread.sleep(3000);
		driver.close();
	}

}
