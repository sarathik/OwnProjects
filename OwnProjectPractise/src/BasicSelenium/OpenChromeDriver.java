package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver {

	public static void main(String[] args) {
		// This Program to Explain Initantiate Webdriver and Open Chrome Browser
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();

	}

}
