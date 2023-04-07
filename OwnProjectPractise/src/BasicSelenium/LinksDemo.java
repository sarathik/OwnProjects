package BasicSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// This Program is for the Link practice
		
		String url = "https://www.leafground.com/link.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		// Case 1 - Click the link to navigate to Dashboard
		WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
		driver.navigate().back();
		
		//Case 2 - Count how many links in this page
		List<WebElement> listofLinks = driver.findElements(By.tagName("a"));
		int count = listofLinks.size();
		System.out.println(count);

	}

}
